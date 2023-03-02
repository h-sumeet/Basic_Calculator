package Basic_Calculator.History;
import java.util.*;

public class Recent_5_log {
    static Queue<String> recent_history = new LinkedList<>();

    public static void add_to_history(String operation) {
        if(recent_history.size() > 4) recent_history.remove();
        recent_history.add(operation);
    }

    public static void recent_five_log() {
        for(String log : recent_history) {
            System.out.println(log);
        }
    }
}
