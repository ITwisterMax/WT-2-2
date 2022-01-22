package application.entity;

import java.util.Objects;

/**
 * Refrigerator class
 */
public class Refrigerator extends Appliance {
    /**
     * Refrigerator power consumption
     */
    private double powerConsumption;

    /**
     * Refrigerator weight
     */
    private double weight;

    /**
     * Refrigerator freezer capacity
     */
    private double freezerCapacity;

    /**
     * Refrigerator overall capacity
     */
    private double overallCapacity;

    /**
     * Refrigerator height
     */
    private double height;

    /**
     * Refrigerator width
     */
    private double width;

    /**
     * Default constructor
     */
    public Refrigerator() {
    }

    /**
     * Constructor
     *
     * @param name - refrigerator name
     * @param price - refrigerator price
     * @param powerConsumption - refrigerator power consumption
     * @param weight - refrigerator weight
     * @param freezerCapacity - refrigerator freezer capacity
     * @param overallCapacity - refrigerator overall capacity
     * @param height - refrigerator height
     * @param width - refrigerator width
     */
    public Refrigerator(
            String name,
            double price,
            double powerConsumption,
            double weight,
            double freezerCapacity,
            double overallCapacity,
            double height,
            double width
    ) {
        super(name, price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
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

        Refrigerator refrigerator = (Refrigerator) o;
        return name.equals(refrigerator.name) &&
                price == refrigerator.price &&
                powerConsumption == refrigerator.powerConsumption &&
                weight == refrigerator.weight &&
                freezerCapacity == refrigerator.freezerCapacity &&
                overallCapacity == refrigerator.overallCapacity &&
                height == refrigerator.height &&
                width == refrigerator.width;
    }

    /**
     * Override hashCode method
     *
     * @return int - refrigerator hash
     */
    @Override
    public int hashCode() {
        return Objects.hash(
                powerConsumption,
                weight,
                freezerCapacity,
                overallCapacity,
                height,
                width
        );
    }

    /**
     * Override toString method
     *
     * @return String - refrigerator information
     */
    @Override
    public String toString() {
        return "Refrigerator [" +
                "\n\tname = " + name +
                ",\n\tprice = " + price +
                ",\n\tpowerConsumption = " + powerConsumption +
                ",\n\tweight = " + weight +
                ",\n\tfreezerCapacity = " + freezerCapacity +
                ",\n\toverallCapacity = " + overallCapacity +
                ",\n\theight = " + height +
                ",\n\twidth = " + width +
                "\n]\n";
    }

    /**
     * Power consumption getter
     *
     * @return double - refrigerator power consumption
     */
    public double getPowerConsumption() {
        return powerConsumption;
    }

    /**
     * Power consumption setter
     *
     * @param powerConsumption - refrigerator power consumption
     */
    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    /**
     * Weight getter
     *
     * @return double - refrigerator weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Weight setter
     *
     * @param weight - refrigerator weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Freezer capacity getter
     *
     * @return double - refrigerator freezer capacity
     */
    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    /**
     * Freezer capacity setter
     *
     * @param freezerCapacity - refrigerator freezer capacity
     */
    public void setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    /**
     * Overall capacity getter
     *
     * @return double - refrigerator overall capacity
     */
    public double getOverallCapacity() {
        return overallCapacity;
    }

    /**
     * Overall capacity setter
     *
     * @param overallCapacity - refrigerator overall capacity
     */
    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    /**
     * Height getter
     *
     * @return double - refrigerator height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Height setter
     *
     * @param height - refrigerator height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Width getter
     *
     * @return double - refrigerator width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Width setter
     *
     * @param width - refrigerator width
     */
    public void setWidth(double width) {
        this.width = width;
    }
}
