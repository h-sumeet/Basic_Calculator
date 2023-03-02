package Basic_Calculator;
import Basic_Calculator.Calculator.*;
import Basic_Calculator.History.*;

public class Main {
    public static void main(String[] args) {
        double num1 = 10.23;
        double num2 = 46.33;

        double ans = Add.add_number(num1, num2);
        System.out.println(ans);

        double ans1 = Subtract.subtract_number(num1, num2);
        System.out.println(ans1);

        double ans2 = Multiply.multiply_number(num1, num2);
        System.out.println(ans2);

        double ans3 = Divide.divide_number(num1, num2);
        System.out.println(ans3);

        Recent_5_log.recent_five_log();
    }
}
