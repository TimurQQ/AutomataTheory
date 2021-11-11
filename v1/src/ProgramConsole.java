import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProgramConsole {
    public static void main(String[] args) {
        StatMaster stat = new StatMaster();
        StateMachine sm = new StateMachine();
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        while (!line.equals("")) {
            boolean match = sm.CheckString(line);
            System.out.println(match);
            if (match) stat.addToStatistic(sm.getNumbers());
            line = sc.nextLine();
        }
        System.out.println("STATISTIC FOR CORRECT STRINGS");
        HashMap<String, Long> map = stat.getStatistic();
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            String number = entry.getKey();
            Long count = entry.getValue();
            System.out.print(number + ":" + count + "\n");
        }
    }
}