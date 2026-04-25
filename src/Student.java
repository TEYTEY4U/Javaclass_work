public class Student {
    String name;
    int rollNumber;
    String course;
    double fee;
    double marks;
    char grade;

    Student() {
        name = "Unknown";
        rollNumber = 0;
        course = "Not Assigned";
        fee = 0.0;
        marks = 0.0;
        grade = 'F';
    }

    Student(String studentName, int studentRollNumber, String studentCourse, double studentFee, double studentMarks) {
        this.name = studentName;
        this.rollNumber = studentRollNumber;
        this.course = studentCourse;
        this.fee = studentFee;
        this.marks = studentMarks;
        calculateGrade();
    }

    @Override
    public String toString() {
       return "Name: " + name +
       "Roll Number: " + rollNumber +
       "Course: " + course +
       "Fee: " + fee +
       "Marks: " + marks +
       "Grade: " + grade;
    }
    
    void calculateGrade() {
        if (marks >= 75) {
            grade ='A';
        } else if (marks >= 60) {
            grade = 'B';
        } else if (marks >= 50) {
            grade = 'C';
        } else if (marks >= 45) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }
    
    void updateFee(double newFee) {
        fee = newFee;
        System.out.println("Fee updated successfully!");
    }
    
    boolean isPassing() {
        return marks >= 50;
    }

}
