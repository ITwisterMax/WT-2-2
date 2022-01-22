package application.entity.criteria;

/**
 * SearchCriteria class
 */
public final class SearchCriteria {
	/**
	 * Oven enum
	 */
	public enum Oven implements ApplianceCriteria {
		/**
		 * Oven power consumption
		 */
		POWER_CONSUMPTION("powerConsumption"),

		/**
		 * Oven weight
		 */
		WEIGHT("weight"),

		/**
		 * Oven capacity
		 */
		CAPACITY("capacity"),

		/**
		 * Oven depth
		 */
		DEPTH("depth"),

		/**
		 * Oven height
		 */
		HEIGHT("height"),

		/**
		 * Oven width
		 */
		WIDTH("width");

		/**
		 * Oven name
		 */
		private final String name;

		/**
		 * Enum constructor
		 *
		 * @param name - oven name
		 */
		Oven(String name) {
			this.name = name;
		}

		/**
		 * Name getter
		 *
		 * @return String - oven name
		 */
		@Override
		public String getName() {
			return name;
		}

		/**
		 * Group name getter
		 *
		 * @return String - group name
		 */
		public String getGroupName() {
			return "Oven";
		}
	}

	/**
	 * Laptop enum
	 */
	public enum Laptop implements ApplianceCriteria {
		/**
		 * Laptop battery capacity
		 */
		BATTERY_CAPACITY("batteryCapacity"),

		/**
		 * Laptop os
		 */
		OS("os"),

		/**
		 * Laptop memory rom
		 */
		MEMORY_ROM("memoryRom"),

		/**
		 * Laptop system memory
		 */
		SYSTEM_MEMORY("systemMemory"),

		/**
		 * Laptop cpu
		 */
		CPU("CPU"),

		/**
		 * Laptop display inches
		 */
		DISPLAY_INCHS("displayInches");

		/**
		 * Laptop name
		 */
		private final String name;

		/**
		 * Enum constructor
		 *
		 * @param name - laptop name
		 */
		Laptop(String name) {
			this.name = name;
		}

		/**
		 * Name getter
		 *
		 * @return String - oven name
		 */
		@Override
		public String getName() {
			return name;
		}

		/**
		 * Group name getter
		 *
		 * @return String - group name
		 */
		public static String getGroupName() {
			return "Laptop";
		}
	}

	/**
	 * Refrigerator enum
	 */
	public enum Refrigerator implements ApplianceCriteria {
		/**
		 * Refrigerator power consumption
		 */
		POWER_CONSUMPTION("powerConsumption"),

		/**
		 * Refrigerator weight
		 */
		WEIGHT("weight"),

		/**
		 * Refrigerator freezer capacity
		 */
		FREEZER_CAPACITY("freezerCapacity"),

		/**
		 * Refrigerator overall capacity
		 */
		OVERALL_CAPACITY("overallCapacity"),

		/**
		 * Refrigerator height
		 */
		HEIGHT("height"),

		/**
		 * Refrigerator width
		 */
		WIDTH("width");

		/**
		 * Refrigerator name
		 */
		private final String name;

		/**
		 * Enum constructor
		 *
		 * @param name - laptop name
		 */
		Refrigerator(String name) {
			this.name = name;
		}

		/**
		 * Name getter
		 *
		 * @return String - refrigerator name
		 */
		@Override
		public String getName() {
			return name;
		}

		/**
		 * Group name getter
		 *
		 * @return String - group name
		 */
		public static String getGroupName() {
			return "Refrigerator";
		}
	}

	/**
	 * Enum for vacuum cleaner criteria.
	 */
	public enum VacuumCleaner implements ApplianceCriteria {
		/**
		 * Vacuum cleaner power consumption
		 */
		POWER_CONSUMPTION("powerConsumption"),

		/**
		 * Vacuum cleaner filter type
		 */
		FILTER_TYPE("filterType"),

		/**
		 * Vacuum cleaner bag type
		 */
		BAG_TYPE("bagType"),

		/**
		 * Vacuum cleaner wand type
		 */
		WAND_TYPE("wandType"),

		/**
		 * Vacuum cleaner motor speed regulation
		 */
		MOTOR_SPEED_REGULATION("motorSpeedRegulation"),

		/**
		 * Vacuum cleaner cleaning width
		 */
		CLEANING_WIDTH("cleaningWidth");

		/**
		 * Vacuum cleaner name
		 */
		private final String name;

		/**
		 * Enum constructor
		 *
		 * @param name - vacuum cleaner name
		 */
		VacuumCleaner(String name) {
			this.name = name;
		}

		/**
		 * Name getter
		 *
		 * @return String - vacuum cleaner name
		 */
		@Override
		public String getName() {
			return name;
		}

		/**
		 * Group name getter
		 *
		 * @return String - group name
		 */
		public static String getGroupName() {
			return "VacuumCleaner";
		}
	}

	/**
	 * Enum for kettle criteria
	 */
	public enum Kettle implements ApplianceCriteria {
		/**
		 * Kettle power consumption
		 */
		POWER_CONSUMPTION("powerConsumption"),

		/**
		 * Kettle capacity
		 */
		CAPACITY("capacity"),

		/**
		 * Kettle height
		 */
		HEIGHT("height");

		/**
		 * Kettle name
		 */
		private final String name;

		/**
		 * Enum constructor
		 *
		 * @param name - kettle name
		 */
		Kettle(String name) {
			this.name = name;
		}

		/**
		 * Name getter
		 *
		 * @return String - kettle name
		 */
		@Override
		public String getName() {
			return name;
		}

		/**
		 * Group name getter
		 *
		 * @return String - group name
		 */
		public static String getGroupName() {
			return "Kettle";
		}
	}

	/**
	 * Constructor
	 */
	private SearchCriteria() {
	}
}
