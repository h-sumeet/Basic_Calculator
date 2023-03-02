package Basic_Calculator.Student;

public class Student {
    int[] marks;

    // constructor
    public Student(int[] marks) {
        this.marks = marks;
    }

    public int total_mark() {
       int total = Add.add_marks(marks);
       return total;
    }
}
