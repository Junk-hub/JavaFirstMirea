package ru.mirea.task15.opt2;

import java.io.*;
public class Readinfo {
    public static void main(String[] args){
        try (FileReader reader = new FileReader("C:\\Users\\1oran\\Downloads\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task15\\info1.txt")){
            System.out.println("Из файла получен текст: ");
            int c;
            while ((c = reader.read()) != -1)
                System.out.print((char) c);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
