package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Program {

    public static void main(String[] args) throws IOException {
        StatMaster stat = new StatMaster();
        Pattern pattern =
                Pattern.compile("(tel|fax|(?:sms())):(\\+[0-9]{11}(,\\+[0-9]{11})*);(\\2(\\?body=[0-9a-zA-Z%.,!?]{0,64})?|(?!\\2$))");

        FileReader fileReader = new FileReader("B:\\to_Git\\Automata-theory\\generated_files\\combined_file.txt");
        BufferedReader reader = new BufferedReader(fileReader);
        String line = reader.readLine();
        while (line != null) {
            Matcher matcher = pattern.matcher(line);
            boolean matches = matcher.matches();
            if (!matches) {
                System.out.println("WRONG");
                return;
            } else {
                stat.addToStatistic(List.of(matcher.group(3).split(",")));
            }
            line = reader.readLine();
        }
        System.out.println("ALL OF CORRECT STRINGS HAVE BEEN RECOGNIZED");
        fileReader = new FileReader("B:\\to_Git\\Automata-theory\\generated_negative_files\\combined_negative_file.txt");
        reader = new BufferedReader(fileReader);
        line = reader.readLine();
        while (line != null) {
            Matcher matcher = pattern.matcher(line);
            boolean matches = matcher.matches();
            if (matches) {
                System.out.println(line);
                System.out.println("WRONG");
                return;
            }
            line = reader.readLine();
        }
        System.out.println("ALL OF INCORRECT STRINGS HAVE BEEN RECOGNIZED");

        System.out.println("STATISTIC FOR CORRECT STRINGS");
        HashMap<String, Long> map = stat.getStatistic();
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            String number = entry.getKey();
            Long count = entry.getValue();
            System.out.print(number + ":" + count + "\n");
        }
    }
}