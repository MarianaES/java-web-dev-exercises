package exercises.technology;

public class Smartphone extends Computer {

    public static void main(String[] args) {
        Smartphone iPhone12Pro = new Smartphone("iOS14", 6.1, "Pacific Blue", true);
        iPhone12Pro.setPrice(999);
        iPhone12Pro.applyPriceDiscount(false);
        System.out.println(iPhone12Pro.getPrice());
        System.out.println(iPhone12Pro.isWaterResistant());
    }

    private String color;
    private boolean waterResistant;

    public Smartphone(String aOperatingSystem, double aDisplay, String aColor, boolean aWaterResistant) {
        super(aOperatingSystem, aDisplay);
        color = aColor;
        waterResistant = aWaterResistant;
    }

    public boolean isWaterResistant() {
        return this.waterResistant;
    }
}
