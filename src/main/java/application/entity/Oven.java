package application.entity;

import java.util.Objects;

/**
 * Oven class
 */
public class Oven extends Appliance {
    /**
     * Oven power consumption
     */
    private double powerConsumption;

    /**
     * Oven weight
     */
    private double weight;

    /**
     * Oven capacity
     */
    private double capacity;

    /**
     * Oven depth
     */
    private double depth;

    /**
     * Oven height
     */
    private double height;

    /**
     * Oven width
     */
    private double width;

    /**
     * Default constructor
     */
    public Oven() {
    }

    /**
     * Constructor
     *
     * @param name - oven name
     * @param price - oven price
     * @param powerConsumption - oven power consumption
     * @param weight - oven weight
     * @param capacity - oven capacity
     * @param depth - oven depth
     * @param height - oven height
     * @param width - oven width
     */
    public Oven(
            String name,
            double price,
            double powerConsumption,
            double weight,
            double capacity,
            double depth,
            double height,
            double width
    ) {
        super(name, price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
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

        Oven oven = (Oven)o;
        return name.equals(oven.name) &&
                price == oven.price &&
                powerConsumption == oven.powerConsumption &&
                weight == oven.weight &&
                capacity == oven.capacity &&
                depth == oven.depth &&
                height == oven.height &&
                width == oven.width;
    }

    /**
     * Override hashCode method
     *
     * @return int - oven hash
     */
    @Override
    public int hashCode() {
        return Objects.hash(
                powerConsumption,
                weight,
                capacity,
                depth,
                height,
                width
        );
    }

    /**
     * Override toString method
     *
     * @return String - oven information
     */
    @Override
    public String toString() {
        return "Oven [" +
                "\n\tname = " + name +
                ",\n\tprice = " + price +
                ",\n\tpowerConsumption = " + powerConsumption +
                ",\n\tweight = " + weight +
                ",\n\tcapacity = " + capacity +
                ",\n\tdepth = " + depth +
                ",\n\theight = " + height +
                ",\n\twidth = " + width +
                "\n]\n";
    }

    /**
     * Power consumption getter
     *
     * @return double - oven power consumption
     */
    public double getPowerConsumption() {
        return powerConsumption;
    }

    /**
     * Power consumption setter
     *
     * @param powerConsumption - oven power consumption
     */
    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    /**
     * Weight getter
     *
     * @return double - oven weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Weight setter
     *
     * @param weight - oven weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Capacity getter
     *
     * @return double - oven capacity
     */
    public double getCapacity() {
        return capacity;
    }

    /**
     * Capacity setter
     *
     * @param capacity - oven capacity
     */
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    /**
     * Depth getter
     *
     * @return double - oven depth
     */
    public double getDepth() {
        return depth;
    }

    /**
     * Height setter
     *
     * @param depth - oven depth
     */
    public void setDepth(double depth) {
        this.depth = depth;
    }

    /**
     * Height getter
     *
     * @return double - oven height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Height setter
     *
     * @param height - oven height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Width getter
     *
     * @return double - oven width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Width setter
     *
     * @param width - oven width
     */
    public void setWidth(double width) {
        this.width = width;
    }
}
