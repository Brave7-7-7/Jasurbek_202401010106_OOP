// Lab sheet names this file "Appliances.java", but the template class is "Appliance" — using Appliance.java so the filename matches the public class.
public abstract class Appliance {
    protected String brand;

    public Appliance(String brand) {
        this.brand = brand;
    }

    public void displayBrand() {
        System.out.println("Brand : " + brand);
    }

    public void turnOn() {
        System.out.println("Power ON");
    }

    public void turnOff() {
        System.out.println("Power OFF");
    }

    public abstract void operate();

    // Appliance is abstract, so it cannot be instantiated directly:
    // Appliance a = new Appliance("Generic"); // compile error
}
