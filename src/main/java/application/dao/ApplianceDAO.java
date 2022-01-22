package application.dao;

import application.entity.Appliance;
import application.entity.criteria.Criteria;

import java.util.List;

/**
 * ApplianceDAO interface
 */
public interface ApplianceDAO {
	/**
	 * All appliances getter
	 *
	 * @return List<Appliance> - list of appliances
	 */
	List<Appliance> getAll();

	/**
	 * Appliances by criteria getter
	 *
	 * @param criteria - search criteria
	 *
	 * @return List<Appliance> - list of appliances
	 */
	List<Appliance> getByCriteria(Criteria criteria);

	/**
	 * Save list of appliances
	 *
	 * @param appliances - list of appliances
	 */
	void save(List<Appliance> appliances);
}
