package Lessons.lessons_09_01.Exceptions;

import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        writeSomthing("bla bla bla");
    }

    public static void writeSomthing(String str) {
        try {
            FileWriter fileWriter = new FileWriter("text.txt");
            FileWriter fileWriter2 = new FileWriter("text.txt");
            fileWriter.write(str);
            fileWriter.close();
            fileWriter2.close();
        } catch (IOException e) {
            System.out.println("Here");

        } finally {
            System.out.println("Учите теорию");
        }
        System.out.println("Работа программы за блоком Try...catch ");
    }
}