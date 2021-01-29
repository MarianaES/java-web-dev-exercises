package exercises.technology;

public class Laptop extends Computer {

    public static void main(String[] args) {
        Laptop macBookAir = new Laptop("macOS", 13.3, 15, false);
        macBookAir.setPrice(1249);
        macBookAir.applyPriceDiscount(true);
        System.out.println(macBookAir.getPrice());
        System.out.println(macBookAir.hasTouchScreen());
    }

    private boolean touchScreen;

    public Laptop(String aOperatingSystem, double aDisplay, int aBatteryLife, boolean atouchScreen) {
        super(aOperatingSystem, aDisplay, aBatteryLife);
        touchScreen = atouchScreen;
    }

    public boolean hasTouchScreen() {
        return this.touchScreen;
    }

}
