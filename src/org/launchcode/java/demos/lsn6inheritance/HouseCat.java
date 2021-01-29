package org.launchcode.java.demos.lsn6inheritance;

public class HouseCat extends Cat {

    public static void main(String[] args) {
        HouseCat jiji = new HouseCat("Jiji", 12);
        jiji.eat();
        System.out.println(jiji.isTired());
    }

    private String name;
    private String species = "Felis catus";

    public HouseCat(String aName, double aWeight) {
        super(aWeight);
        name = aName;
    }

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

    @Override
    public String noise() {
        return "Hello, my name is " + name + "!";
    }

    public String purr() {
        return "I'm a HouseCat";
    }
}
