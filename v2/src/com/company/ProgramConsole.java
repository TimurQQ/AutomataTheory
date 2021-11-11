package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgramConsole {
    public static void main(String[] args) {
        StatMaster stat = new StatMaster();
        Pattern pattern =
                Pattern.compile("(tel|fax|(?:sms())):(\\+[0-9]{11}(,\\+[0-9]{11})*);(\\2(\\?body=[0-9a-zA-Z%.,!?]{0,64})?|(?!\\2$))");

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        while (!line.equals("")) {
            Matcher matcher = pattern.matcher(line);
            boolean matches = matcher.matches();
            System.out.println(matches);
            if (matches) stat.addToStatistic(List.of(matcher.group(3).split(",")));
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
