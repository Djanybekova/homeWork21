package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("File.txt");
        FileWriter fileWriter = new FileWriter("File.txt");
        int count = 0;
           for (char j = 'A'; j <= 'Z'; j++) {
               for (char i = 'a'; i <= 'z'; i++) {
                   if (i - j == 32) {
                       count++;
                       fileWriter.write(count + ":" + j + " " + i + "\n");
                       System.out.print(count + ":" + j + " " + i + "\n");
                   }
               }
           }
           for (int i = 0; i < 10; i++) {
               count++;
               fileWriter.write(count + ":" + i + " \n");
               System.out.print(count + ":" + i + " \n");
           }
           fileWriter.close();
           fileReader.close();
    }
}
