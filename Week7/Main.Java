public class Main {

    public static void main(String[] args) {

        Appliance airConditioner = new AirConditioner("Samsung");
        Appliance refrigerator = new Refrigerator("Panasonic");

        airConditioner.displayBrand();
        airConditioner.turnOn();
        airConditioner.operate();
        airConditioner.turnOff();

        System.out.println();

        refrigerator.displayBrand();
        refrigerator.turnOn();
        refrigerator.operate();
        refrigerator.turnOff();
    }
}
