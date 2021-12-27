package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Timing {
    public static void main(String[] args) throws IOException {
        Pattern pattern =
                Pattern.compile("(tel|fax|(?:sms())):(\\+[0-9]{11}(,\\+[0-9]{11})*);(\\2(\\?body=[0-9a-zA-Z%.,!?]{0,64})?|(?!\\2$))");
        String[] cases = {
                "B:\\to_Git\\Automata-theory\\generated_timing\\timing_100.txt",
                "B:\\to_Git\\Automata-theory\\generated_timing\\timing_1000.txt",
                "B:\\to_Git\\Automata-theory\\generated_timing\\timing_10000.txt",
        };
        String[] withLengthCases = {
                "B:\\to_Git\\Automata-theory\\generated_timing\\timing_len_10.txt",
                "B:\\to_Git\\Automata-theory\\generated_timing\\timing_len_50.txt",
                "B:\\to_Git\\Automata-theory\\generated_timing\\timing_len_100.txt",
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
                Matcher matcher = pattern.matcher(s);
                boolean match = matcher.matches();
            }
            long nanoEndTime = System.nanoTime();
            System.out.println("Count_cases");
            System.out.println(nanoEndTime - nanoStartTime);
        }
        for (String _case : withLengthCases) {
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
                Matcher matcher = pattern.matcher(s);
                boolean match = matcher.matches();
            }
            long nanoEndTime = System.nanoTime();
            System.out.println("Len_cases");
            System.out.println(nanoEndTime - nanoStartTime);
        }
    }
}
