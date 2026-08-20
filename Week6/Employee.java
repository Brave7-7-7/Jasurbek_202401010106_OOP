public class Employee {
    protected String id;
    protected String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayInfo() {
        System.out.printf("%-12s: %s%n", "Employee ID", id);
        System.out.printf("%-12s: %s%n", "Name", name);
    }
}
