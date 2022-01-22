package application.entity;

import java.util.Objects;

/**
 * Laptop class
 */
public class Laptop extends Appliance {
    /**
     * Laptop battery capacity
     */
    private double batteryCapacity;

    /**
     * Laptop os
     */
    private String os;

    /**
     * Laptop memory rom
     */
    private double memoryRom;

    /**
     * Laptop system memory
     */
    private double systemMemory;

    /**
     * Laptop cpu
     */
    private double cpu;

    /**
     * Laptop display inches
     */
    private double displayInches;

    /**
     * Default constructor
     */
    public Laptop() {
    }

    /**
     * Constructor
     *
     * @param name - laptop name
     * @param price - laptop price
     * @param batteryCapacity - laptop battery capacity
     * @param os - laptop os
     * @param memoryRom - laptop memory rom
     * @param systemMemory - laptop system memory
     * @param cpu - laptop cpu
     * @param displayInches - laptop display inches
     */
    public Laptop(
            String name,
            double price,
            double batteryCapacity,
            String os,
            double memoryRom,
            double systemMemory,
            double cpu,
            double displayInches
    ) {
        super(name, price);
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Laptop laptop = (Laptop)o;
        return name.equals(laptop.name) &&
                price == laptop.price &&
                batteryCapacity == laptop.batteryCapacity &&
                os.equals(laptop.os) &&
                memoryRom == laptop.memoryRom &&
                systemMemory == laptop.systemMemory &&
                cpu == laptop.cpu  &&
                displayInches == laptop.displayInches;
    }

    /**
     * Override hashCode method
     *
     * @return int - laptop hash
     */
    @Override
    public int hashCode() {
        return Objects.hash(
                batteryCapacity,
                os,
                memoryRom,
                systemMemory,
                cpu,
                displayInches
        );
    }

    /**
     * Override toString method
     *
     * @return String - laptop information
     */
    @Override
    public String toString() {
        return "Laptop [" +
                "\n\tname = " + name +
                ",\n\tprice = " + price +
                ",\n\tbatteryCapacity = " + batteryCapacity +
                ",\n\tos = " + os +
                ",\n\tmemoryRom = " + memoryRom +
                ",\n\tsystemMemory = " + systemMemory +
                ",\n\tCPU = " + cpu +
                ",\n\tdisplayInches = " + displayInches +
                "\n]\n";
    }

    /**
     * Battery capacity getter
     *
     * @return double - laptop battery capacity
     */
    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    /**
     * Battery capacity setter
     *
     * @param batteryCapacity - laptop battery capacity
     */
    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    /**
     * OS getter
     *
     * @return String - laptop OS
     */
    public String getOs() {
        return os;
    }

    /**
     * OS setter
     *
     * @param os - laptop OS
     */
    public void setOs(String os) {
        this.os = os;
    }

    /**
     * Memory rom getter
     *
     * @return double - laptop memory rom
     */
    public double getMemoryRom() {
        return memoryRom;
    }

    /**
     * Memory rom setter
     *
     * @param memoryRom - laptop memory rom
     */
    public void setMemoryRom(double memoryRom) {
        this.memoryRom = memoryRom;
    }

    /**
     * System memory getter
     *
     * @return double - laptop system memory
     */
    public double getSystemMemory() {
        return systemMemory;
    }

    /**
     * System memory setter
     *
     * @param systemMemory - laptop system memory
     */
    public void setSystemMemory(double systemMemory) {
        this.systemMemory = systemMemory;
    }

    /**
     * CPU getter
     *
     * @return double - laptop CPU
     */
    public double getCpu() {
        return cpu;
    }

    /**
     * CPU setter
     *
     * @param cpu - laptop CPU
     */
    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    /**
     * Display inches getter
     *
     * @return double - laptop display inches
     */
    public double getDisplayInches() {
        return displayInches;
    }

    /**
     * Display inches setter
     *
     * @param displayInches - laptop display inches
     */
    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }
}
