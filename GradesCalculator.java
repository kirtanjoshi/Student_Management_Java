public class GradesCalculator {
    private Student student;

    // Constructor to initialize the grade and associate a student
    public GradesCalculator(Student student) {
        this.student = student;
    }

    // Method to categorize the grade
    public String getGradeCategory() {
        if (student.marks >= 90) {
            return "A";
        } else if (student.marks >= 75) {
            return "B";
        } else if (student.marks >= 50) {
            return "C";
        } else {
            return "FAIL";
        }
    }

    // Method to display the grade and its category
    public void displayGrade() {
        System.out.println("Grade: " + student.marks);
        System.out.println("Grade Category: " + getGradeCategory());
    }
}
