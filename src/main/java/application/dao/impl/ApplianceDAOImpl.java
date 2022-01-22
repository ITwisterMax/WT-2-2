package application.dao.impl;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import application.dao.ApplianceDAO;
import application.entity.Appliance;
import application.entity.criteria.Criteria;

/**
 * ApplianceDAOImpl class
 */
public class ApplianceDAOImpl implements ApplianceDAO {
	/**
	 * Path to xml file with appliance information
	 */
	private static final String PATH = "src/main/resources/appliances.xml";

	/**
	 * All appliances getter
	 *
	 * @return List<Appliance> - list of appliances
	 */
	@Override
	public List<Appliance> getAll() {
		ArrayList<Appliance> appliances = new ArrayList<>();
		Appliance appliance;

		// Open file and read information about appliances
		try (XMLDecoder decoder = new XMLDecoder(
				new BufferedInputStream(new FileInputStream(ApplianceDAOImpl.PATH)))
		) {
			do {
				appliance = (Appliance) decoder.readObject();
				appliances.add(appliance);
			} while (appliance != null);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// End of file
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return appliances;
	}

	/**
	 * Appliances by criteria getter
	 *
	 * @param criteria - search criteria
	 *
	 * @return List<Appliance> - list of appliances
	 */
	@Override
	public List<Appliance> getByCriteria(Criteria criteria) {
		ArrayList<Appliance> appliances = new ArrayList<>();
		Appliance appliance;

		// Open file and read information about appliances by criteria
		try (XMLDecoder decoder = new XMLDecoder(
				new BufferedInputStream(new FileInputStream(ApplianceDAOImpl.PATH)))
		) {
			do {
				appliance = (Appliance) decoder.readObject();

				// Check if appliance has necessary property
				if (this.hasProperties(appliance, criteria)) {
					appliances.add(appliance);
				}
			} while (appliance != null);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// End of file
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return appliances;
	}

	/**
	 * Save list of appliances
	 *
	 * @param appliances - list of appliances
	 */
	@Override
	public void save(List<Appliance> appliances) {
		try (XMLEncoder encoder = new XMLEncoder(
				new BufferedOutputStream(new FileOutputStream(ApplianceDAOImpl.PATH)))
		) {
			for (Appliance appliance: appliances) {
				encoder.writeObject(appliance);
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// End of file
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Check if appliance has property
	 *
	 * @param appliance - appliance information
	 * @param criteria - search criteria
	 * @return boolean - search result
	 *
	 * @throws NoSuchFieldException - appliance has no such criteria
	 * @throws IllegalAccessException - access to appliance field is closed
	 */
	private boolean hasProperties(Appliance appliance, Criteria criteria)
			throws NoSuchFieldException,IllegalAccessException {
		// Skip if group name isn't equal current appliance name
		if (!criteria.getGroupName().equals(appliance.getClass().getSimpleName())) {
			return false;
		}

		// Find necessary property
		Set<String> properties = criteria.getCriteria().keySet();
		for (String prop : properties) {
			Object fieldValue;
			Field field = appliance.getClass().getDeclaredField(prop);
			field.setAccessible(true);
			fieldValue = field.get(appliance);

			if (!fieldValue.equals(criteria.getCriteria().get(prop))) {
				return false;
			}
		}

		return true;
	}
}