package application.helper;

import java.util.List;
import application.entity.Appliance;

/**
 * AppliancesPrinter class
 */
public class AppliancesPrinter {
	/**
	 *	Print appliances information
	 *
	 * @param appliances - appliances list
	 */
	public static void print(List<Appliance> appliances) {
		for (Appliance appliance : appliances) {
			System.out.println(appliance);
		}
	}
}
