package application.service;

import java.util.Comparator;
import java.util.List;
import application.entity.Appliance;
import application.entity.criteria.Criteria;

/**
 * ApplianceService interface
 */
public interface ApplianceService {
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
	 * Appliances by min price getter
	 *
	 * @param comparator - defines appliance min price
	 *
	 * @return List<Appliance> - list of appliances
	 */
	List<Appliance> getByMinPrice(Comparator<Appliance> comparator);

	/**
	 * Save list of appliances
	 *
	 * @param appliances - list of appliances
	 */
	void save(List<Appliance> appliances);
}
