package application.service.validation;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import application.entity.criteria.*;

/**
 * Validator class
 */
public class Validator {
	/**
	 * Constructor
	 */
	private Validator() {
	}

	/**
	 * Checks if criteria is valid
	 *
	 * @param criteria - search criteria
	 *
	 * @return boolean - validator result
	 */
	public static boolean criteriaValidator(Criteria criteria) {
		return switch (criteria.getGroupName()) {
			case "Oven" -> checkIfCriteriaExists(criteria, SearchCriteria.Oven.values());
			case "Laptop" -> checkIfCriteriaExists(criteria, SearchCriteria.Laptop.values());
			case "Refrigerator" -> checkIfCriteriaExists(criteria, SearchCriteria.Refrigerator.values());
			case "VacuumCleaner" -> checkIfCriteriaExists(criteria, SearchCriteria.VacuumCleaner.values());
			case "Kettle" -> checkIfCriteriaExists(criteria, SearchCriteria.Kettle.values());
			default -> false;
		};
	}

	/**
	 * Check if criteria exists
	 *
	 * @param criteria - search criteria
	 * @param existingCriteria - existing criteria
	 *
	 * @return boolean - check result
	 */
	private static boolean checkIfCriteriaExists(Criteria criteria, ApplianceCriteria[] existingCriteria) {
		Set<String> properties = criteria.getCriteria().keySet();

		return properties.stream().allMatch(
				p -> Arrays.stream(existingCriteria).anyMatch(e -> Objects.equals(e.getName(), p))
		);
	}
}