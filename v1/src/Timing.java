import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Timing {
    public static void main(String[] args) throws IOException {
        StateMachine sm = new StateMachine();
        String[] cases = {
                "B:\\to_Git\\Automata-theory\\generated_timing\\timing_100.txt",
                "B:\\to_Git\\Automata-theory\\generated_timing\\timing_1000.txt",
                "B:\\to_Git\\Automata-theory\\generated_timing\\timing_10000.txt",
        };
        FileReader fileReader;
        BufferedReader reader;
        String line;
        for (String _case : cases) {
            List<String> lines = new ArrayList<>();
            fileReader = new FileReader(_case);
            reader = new BufferedReader(fileReader);
            line = reader.readLine();
            while (line != null) {
                lines.add(line);
                line = reader.readLine();
            }
            long nanoStartTime = System.nanoTime();
            for (String s : lines) {
                boolean match = sm.CheckString(s);
            }
            long nanoEndTime = System.nanoTime();
            System.out.println(nanoEndTime - nanoStartTime);
            System.out.println("ALL OF CORRECT STRINGS HAVE BEEN RECOGNIZED");
        }
    }
}
