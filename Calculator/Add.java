package Basic_Calculator.Calculator;
import Basic_Calculator.History.*;

public class Add {
    public static int add_number(int num1, int num2) {
        int ans = num1 + num2;

        Recent_5_log.add_to_history(num1 + " + " + num2 + " = " + ans);
        return ans;
    }

    public static float add_number(float num1, float num2) {
        float ans = num1 + num2;

        Recent_5_log.add_to_history(num1 + " + " + num2 + " = " + ans);
        return ans;
    }

    public static double add_number(double num1, double num2) {
        double ans = num1 + num2;

        Recent_5_log.add_to_history(num1 + " + " + num2 + " = " + ans);
        return ans;
    }
}
