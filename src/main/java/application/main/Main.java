package application.main;

import java.util.Comparator;
import application.entity.Appliance;
import application.helper.AppliancesPrinter;
import application.entity.criteria.Criteria;
import application.entity.criteria.SearchCriteria;
import application.service.ApplianceService;
import application.service.ServiceFactory;

/**
 * Application main class
 */
public class Main {
	/**
	 * Entry point
	 *
	 * @param args - input arguments
	 */
	public static void main(String[] args) {
		// Create necessary instances
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		ApplianceService applianceService = serviceFactory.getApplianceService();
		Criteria kettleCriteria = new Criteria(SearchCriteria.Kettle.getGroupName());

		// Output necessary information
		System.out.println("All appliances:");
		AppliancesPrinter.print(applianceService.getAll());

		System.out.println("All kettles:");
		AppliancesPrinter.print(applianceService.getByCriteria(kettleCriteria));

		System.out.println("Appliances with minimal price:");
		AppliancesPrinter.print(applianceService.getByMinPrice(Comparator.comparing(Appliance::getPrice)));
	}
}
