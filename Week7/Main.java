public class Main {
    public static void main(String[] args) {
        Appliance washingMachine = new WashingMachine("LG");
        Appliance refrigerator = new Refrigerator("Panasonic");

        washingMachine.displayBrand();
        washingMachine.turnOn();
        washingMachine.operate();
        washingMachine.turnOff();

        System.out.println();

        refrigerator.displayBrand();
        refrigerator.turnOn();
        refrigerator.operate();
        refrigerator.turnOff();

        // ===== ACTIVITY 2: additional appliances =====
        Appliance airConditioner = new AirConditioner("Daikin");
        Appliance television = new Television("Samsung");

        System.out.println();

        airConditioner.displayBrand();
        airConditioner.turnOn();
        airConditioner.operate();
        airConditioner.turnOff();

        System.out.println();

        television.displayBrand();
        television.turnOn();
        television.operate();
        television.turnOff();
    }
}
