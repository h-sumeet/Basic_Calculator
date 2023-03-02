package Basic_Calculator.Calculator;
import Basic_Calculator.History.*;

public class Multiply {
    public static int multiply_number(int num1, int num2) {
        int ans = num1*num2;

        Recent_5_log.add_to_history(num1 + " * " + num2 + " = " + ans);
        return ans;
    }

    public static float multiply_number(float num1, float num2) {
        float ans = num1*num2;

        Recent_5_log.add_to_history(num1 + " * " + num2 + " = " + ans);
        return ans;
    }

    public static double multiply_number(double num1, double num2) {
        double ans = num1*num2;

        Recent_5_log.add_to_history(num1 + " * " + num2 + " = " + ans);
        return ans;
    }
}
