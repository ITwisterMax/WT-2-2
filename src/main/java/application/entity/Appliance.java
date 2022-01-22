package application.entity;

/**
 * Appliance class
 */
public class Appliance {
    /**
     * Appliance name
     */
    protected String name;

    /**
     * Appliance price
     */
    protected double price;

    /**
     * Default constructor.
     */
    public Appliance() {
    }

    /**
     * Constructor
     *
     * @param name - appliance name
     * @param price - appliance price
     */
    protected Appliance(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Name getter
     *
     * @return String - appliance name
     */
    public String getName() {
        return name;
    }

    /**
     * Name setter
     *
     * @param name - appliance name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Price getter
     *
     * @return double - appliance price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Price setter
     *
     * @param price - appliance price
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
