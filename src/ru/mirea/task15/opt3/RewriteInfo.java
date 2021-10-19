package ru.mirea.task15.opt3;

import java.io.*;
import java.util.Scanner;;

public class RewriteInfo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String text;

        try(FileWriter writer = new FileWriter("C:\\Users\\1oran\\Downloads\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task15\\info1.txt", false)) {
            System.out.println("Введите информацию, которую необходимо передать в текстовый файл");
            text = scanner.nextLine();
            writer.write(text);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
