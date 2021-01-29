package exercises.technology;

public class Computer {

    private String operatingSystem;
    private double displaySize;
    private int batteryLife;
    private double price;
    private boolean discount;


    public Computer ( String aOperatingSystem, double aDisplay, int aBatteryLife) {
        operatingSystem = aOperatingSystem;
        displaySize = aDisplay;
        batteryLife = aBatteryLife;
    }

    public Computer ( String aOperatingSystem, double aDisplay) {
        operatingSystem = aOperatingSystem;
        displaySize = aDisplay;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public double getPrice() {
        return price;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double applyPriceDiscount(boolean discount) {
        if (discount) {
            price = price * 0.8; //20% holidays discount
        }
        return price;
    }
}
