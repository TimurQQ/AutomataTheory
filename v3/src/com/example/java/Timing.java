package com.example.java;

import com.example.Lexer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Timing {
    public static void main(String[] args) throws IOException {
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
                StringReader mStringReader = new StringReader(s + '\n');
                Lexer mLexer = new Lexer(mStringReader);
                int res = mLexer.yylex();
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
                StringReader mStringReader = new StringReader(s + '\n');
                Lexer mLexer = new Lexer(mStringReader);
                int res = mLexer.yylex();
            }
            long nanoEndTime = System.nanoTime();
            System.out.println("Len_cases");
            System.out.println(nanoEndTime - nanoStartTime);
        }

    }
}
