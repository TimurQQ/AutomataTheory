package com.example.java;

import com.example.Lexer;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProgramConsole {
    public static void main(String[] args) throws IOException {
        StatMaster stat = new StatMaster();
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        while (!line.equals("")) {
            StringReader mStringReader = new StringReader(line + '\n');
            Lexer mLexer = new Lexer(mStringReader);
            int res = mLexer.yylex();
            boolean match = res == 1;
            System.out.println(match);
            if (match) stat.addToStatistic(mLexer.getNumbers());
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
