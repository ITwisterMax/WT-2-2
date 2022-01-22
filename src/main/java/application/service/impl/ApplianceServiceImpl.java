package application.service.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import application.dao.ApplianceDAO;
import application.dao.DAOFactory;
import application.service.validation.Validator;
import application.entity.Appliance;
import application.entity.criteria.Criteria;
import application.service.ApplianceService;

/**
 * ApplianceServiceImpl class
 */
public class ApplianceServiceImpl implements ApplianceService {
	/**
	 * All appliances getter
	 *
	 * @return List<Appliance> - list of appliances
	 */
	@Override
	public List<Appliance> getAll() {
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		return applianceDAO.getAll();
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
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		
		return applianceDAO.getByCriteria(criteria);
	}

	/**
	 * Appliances by min price getter
	 *
	 * @param comparator - defines appliance min price
	 *
	 * @return List<Appliance> - list of appliances
	 */
	@Override
	public List<Appliance> getByMinPrice(Comparator<Appliance> comparator) {
		DAOFactory factory = DAOFactory.getInstance();
		List<Appliance> appliances = factory.getApplianceDAO().getAll();

		// Get list of prices and fin min value
		Optional<Appliance> minPrices = appliances.stream().min(comparator);
		Appliance minPrice = minPrices.orElse(null);
		if (minPrice != null) {
			return appliances.stream().filter(
					p -> comparator.compare(p, minPrice) == 0).collect(Collectors.toList()
			);
		}

		return new ArrayList<>();
	}

	/**
	 * Save list of appliances
	 *
	 * @param appliances - list of appliances
	 */
	@Override
	public void save(List<Appliance> appliances) {
		DAOFactory factory = DAOFactory.getInstance();
		factory.getApplianceDAO().save(appliances);
	}
}
