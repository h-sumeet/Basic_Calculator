package Basic_Calculator;
import Basic_Calculator.Calculator.*;
import Basic_Calculator.History.*;
import Basic_Calculator.Student.*;
import Basic_Calculator.Calculator.Add;

public class Main {
    public static void main(String[] args) {
        double num1 = 10.23;
        double num2 = 46.33;
        
        // Additon of numbers
        double ans = Add.add_number(num1, num2);      // avoid ambiguity by explicitly importing the package
        System.out.println("Addition of two number is " + ans);
       
        // substraction of numbers
        double ans1 = Subtract.subtract_number(num1, num2);
        System.out.println("Substraction of two number is " + ans1);

        // multiplication of number
        double ans2 = Multiply.multiply_number(num1, num2);
        System.out.println("Multiplication of two number is " + ans2);

        // division of number
        double ans3 = Divide.divide_number(num1, num2);
        System.out.println("Division of two number is " + ans3);

        // printing the past 5 logs
        Recent_5_log.recent_five_log();

        int[] marks = {10, 44, 34, 88, 45};
        Student mymarks = new Student(marks);    // creating a student class and passing the list of marks
        int total_mark = mymarks.total_mark();   // geting the total marks 
        System.out.println("Total marks : " +total_mark);
    }
}
