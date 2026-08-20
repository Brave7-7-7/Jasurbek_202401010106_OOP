import java.util.Locale;

public class StudentGrade {
    public static void main(String[] args) {
        // Student identity, hard-coded so the program runs the same everywhere
        String studentName = "Jasurbek";
        String studentId = "202401010106";

        // Marks for each subject
        int mathMark = 85;
        int scienceMark = 72;
        int programmingMark = 91;

        // Total is the sum of the three marks; average divides by the subject count
        int total = mathMark + scienceMark + programmingMark;
        double average = total / 3.0;

        // Map the average onto a letter grade using descending thresholds
        String grade;
        if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Locale.ROOT keeps the decimal separator as '.' regardless of system locale
        String averageFormatted = String.format(Locale.ROOT, "%.2f", average);

        System.out.println("Student Report");
        System.out.println("--------------");
        System.out.println("Name: " + studentName);
        System.out.println("ID: " + studentId);
        System.out.println("Math: " + mathMark);
        System.out.println("Science: " + scienceMark);
        System.out.println("Programming: " + programmingMark);
        System.out.println("Total: " + total);
        System.out.println("Average: " + averageFormatted);
        System.out.println("Grade: " + grade);
    }
}
