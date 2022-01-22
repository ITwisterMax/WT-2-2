package application.entity;

import java.util.Objects;

/**
 * VacuumCleaner class
 */
public class VacuumCleaner extends Appliance {
    /**
     * Vacuum cleaner power consumption
     */
    private double powerConsumption;

    /**
     * Vacuum cleaner filter type
     */
    private String filterType;

    /**
     * Vacuum cleaner bag type
     */
    private String bagType;

    /**
     * Vacuum cleaner wand type
     */
    private String wandType;

    /**
     * Vacuum cleaner motor speed regulation
     */
    private double motorSpeedRegulation;

    /**
     * Vacuum cleaner cleaning width
     */
    private double cleaningWidth;

    /**
     * Default constructor
     */
    public VacuumCleaner() {
    }

    /**
     * Constructor
     *
     * @param name - vacuum name
     * @param price - vacuum price
     * @param powerConsumption - vacuum cleaner power consumption
     * @param filterType - vacuum filter type
     * @param bagType - vacuum bag type
     * @param wandType - vacuum wand type
     * @param motorSpeedRegulation - vacuum motor speed regulation
     * @param cleaningWidth - vacuum cleaner cleaning width
     */
    public VacuumCleaner(
            String name,
            double price,
            double powerConsumption,
            String filterType,
            String bagType,
            String wandType,
            double motorSpeedRegulation,
            double cleaningWidth
    ) {
        super(name, price);
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    /**
     * Override equals method
     *
     * @param o - oven object
     *
     * @return boolean - equals result
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        VacuumCleaner vacuumCleaner = (VacuumCleaner)o;
        return name.equals(vacuumCleaner.name) &&
                price == vacuumCleaner.price &&
                powerConsumption == vacuumCleaner.powerConsumption &&
                filterType.equals(vacuumCleaner.filterType) &&
                bagType.equals(vacuumCleaner.bagType) &&
                wandType.equals(vacuumCleaner.wandType) &&
                motorSpeedRegulation == vacuumCleaner.motorSpeedRegulation &&
                cleaningWidth == vacuumCleaner.cleaningWidth;
    }

    /**
     * Override hashCode method
     *
     * @return int - vacuum cleaner hash
     */
    @Override
    public int hashCode() {
        return Objects.hash(
                powerConsumption,
                filterType,
                bagType,
                wandType,
                motorSpeedRegulation,
                cleaningWidth
        );
    }

    /**
     * Override toString method
     *
     * @return String - vacuum cleaner information
     */
    @Override
    public String toString() {
        return "VacuumCleaner [" +
                "\n\tname = " + name +
                ",\n\tprice = " + price +
                ",\n\tpowerConsumption = " + powerConsumption +
                ",\n\tfilterType = " + filterType +
                ",\n\tbagType = " + bagType +
                ",\n\twandType = " + wandType +
                ",\n\tmotorSpeedRegulation = " + motorSpeedRegulation +
                ",\n\tcleaningWidth = " + cleaningWidth +
                "\n]\n";
    }

    /**
     * Vacuum cleaner power consumption getter
     *
     * @return double - vacuum cleaner power consumption
     */
    public double getPowerConsumption() {
        return powerConsumption;
    }

    /**
     * Vacuum cleaner power consumption setter
     *
     * @param powerConsumption - vacuum cleaner power consumption
     */
    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    /**
     * Vacuum cleaner filter type getter
     *
     * @return String - vacuum cleaner filter type
     */
    public String getFilterType() {
        return filterType;
    }

    /**
     * Vacuum cleaner filter type setter
     *
     * @param filterType - vacuum cleaner filter type
     */
    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    /**
     * Vacuum cleaner bag type getter
     *
     * @return String - vacuum cleaner bag type
     */
    public String getBagType() {
        return bagType;
    }

    /**
     * Vacuum cleaner bag type setter
     *
     * @param bagType - vacuum cleaner bag type
     */
    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    /**
     * Vacuum cleaner wand type getter
     *
     * @return String - vacuum cleaner wand type
     */
    public String getWandType() {
        return wandType;
    }

    /**
     * Vacuum cleaner wand type setter
     *
     * @param wandType - vacuum cleaner wand type
     */
    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    /**
     * Vacuum cleaner motor speed regulation getter
     *
     * @return double - vacuum cleaner motor speed regulation
     */
    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    /**
     * Vacuum cleaner motor speed regulation setter
     *
     * @param motorSpeedRegulation - vacuum cleaner motor speed regulation
     */
    public void setMotorSpeedRegulation(double motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    /**
     * Vacuum cleaner cleaning width getter
     *
     * @return double - vacuum cleaner cleaning width
     */
    public double getCleaningWidth() {
        return cleaningWidth;
    }

    /**
     * Vacuum cleaner cleaning width setter
     *
     * @param cleaningWidth - vacuum cleaner cleaning width
     */
    public void setCleaningWidth(double cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }
}
