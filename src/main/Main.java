package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader
                (new InputStreamReader(System.in));
        System.out.println("enter your name");
        String name = br.readLine();
        System.out.println(name);
        StringBuffer word = new StringBuffer(name);
        word.setCharAt(0, 'e');
        System.out.println(word);
    }
}
