package application.entity.criteria;

import java.util.HashMap;
import java.util.Map;

/**
 * Criteria class
 */
public class Criteria {
	/**
	 * Appliance group name
	 */
	private String groupName;

	/**
	 * Search criteria
	 */
	private Map<String, Object> criteria = new HashMap<String, Object>();

	/**
	 * Constructor
	 *
	 * @param groupName - appliance group name
	 */
	public Criteria(String groupName) {
		this.groupName = groupName;
	}

	/**
	 * @return current criteria
	 */
	public Map<String, Object> getCriteria() {
		return criteria;
	}

	/**
	 * Group name getter
	 *
	 * @return String - appliance group name
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * Add search criteria
	 *
	 * @param searchCriteria - search criteria
	 * @param value - criteria value
	 */
	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}
}
