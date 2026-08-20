public class Lecturer extends Employee {
    private String subject;
    private String department;

    public Lecturer(String id, String name, String subject, String department) {
        super(id, name);
        this.subject = subject;
        this.department = department;
    }

    public void displaySubject() {
        System.out.printf("%-12s: %s%n", "Subject", subject);
    }

    public void displayDepartment() {
        System.out.printf("%-12s: %s%n", "Department", department);
    }
}
