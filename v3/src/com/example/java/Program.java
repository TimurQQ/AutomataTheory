package com.example.java;

import com.example.Lexer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class Program {

    public static void main(String[] args) throws IOException {
        StatMaster stat = new StatMaster();
        FileReader fileReader = new FileReader("B:\\to_Git\\Automata-theory\\generated_files\\combined_file.txt");
        BufferedReader reader = new BufferedReader(fileReader);
        String line = reader.readLine();
        while (line != null) {
            StringReader mStringReader = new StringReader(line + '\n');
            Lexer mLexer = new Lexer(mStringReader);
            int res = mLexer.yylex();
            if (res == 0) {
                System.out.println("WRONG");
                return;
            } else {
                stat.addToStatistic(mLexer.getNumbers());
            }
            line = reader.readLine();
        }
        System.out.println("ALL OF CORRECT STRINGS HAVE BEEN RECOGNIZED");
        fileReader = new FileReader("B:\\to_Git\\Automata-theory\\generated_negative_files\\combined_negative_file.txt");
        reader = new BufferedReader(fileReader);
        line = reader.readLine();
        while (line != null) {
            StringReader mStringReader = new StringReader(line + '\n');
            Lexer mLexer = new Lexer(mStringReader);
            int res = mLexer.yylex();
            if (res == 1) {
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