package application.entity;

import java.util.Objects;

/**
 * Kettle class
 */
public class Kettle extends Appliance {
    /**
     * Kettle power consumption
     */
    private double powerConsumption;

    /**
     * Kettle capacity
     */
    private double capacity;

    /**
     * Kettle height
     */
    private double height;

    /**
     * Default constructor
     */
    public Kettle() {
    }

    /**
     * Constructor
     *
     * @param name - kettle name
     * @param price - kettle price
     * @param powerConsumption - kettle power consumption
     * @param capacity - kettle capacity
     * @param height -  kettle height
     */
    public Kettle(
            String name,
            double price,
            double powerConsumption,
            double capacity,
            double height
    ) {
        super(name, price);
        this.powerConsumption = powerConsumption;
        this.capacity = capacity;
        this.height = height;
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

        Kettle kettle = (Kettle)o;
        return name.equals(kettle.name) &&
                price == kettle.price &&
                powerConsumption == kettle.powerConsumption &&
                capacity == kettle.capacity &&
                height == kettle.height;
    }

    /**
     * Override hashCode method
     *
     * @return int - kettle hash
     */
    @Override
    public int hashCode() {
        return Objects.hash(
                powerConsumption,
                capacity,
                height
        );
    }

    /**
     * Override toString method
     *
     * @return String - kettle information
     */
    @Override
    public String toString() {
        return "Kettle [" +
                "\n\tname = " + name +
                ",\n\tprice = " + price +
                ",\n\tpowerConsumption = " + powerConsumption +
                ",\n\tcapacity = " + capacity +
                ",\n\theight = " + height +
                "\n]\n";
    }

    /**
     * Power consumption getter
     *
     * @return double - kettle power consumption
     */
    public double getPowerConsumption() {
        return powerConsumption;
    }

    /**
     * Power consumption setter
     *
     * @param powerConsumption - kettle power consumption
     */
    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    /**
     * Capacity getter
     *
     * @return double - kettle capacity
     */
    public double getCapacity() {
        return capacity;
    }

    /**
     * Capacity setter
     *
     * @param capacity - kettle capacity
     */
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    /**
     * Height getter
     *
     * @return double - kettle height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Height setter
     *
     * @param height - kettle height
     */
    public void setHeight(double height) {
        this.height = height;
    }
}
