public class Main {
    public static void main(String[] args) {
        Person p0 = new Person("Ali", "P001");
        Person p1 = new Student("Jasurbek", "S202401010106");
        Person p2 = new Lecturer("Dr Ahmad", "L100");

        p0.introduce();
        p1.introduce();
        p2.introduce();
    }
}
