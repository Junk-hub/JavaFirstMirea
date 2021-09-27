package ru.mirea.task8.opt2;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;


public class ShowImage extends JPanel{

    public static void main(String[] args){
        //создание окна
        JFrame fr = new JFrame();
        fr.setSize(500, 400);
        fr.setVisible(true);
        //Добавление изображения в окно
        fr.add(new ShowImage());
        fr.setResizable(false);
    }

    public void paint(Graphics g, String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Введите путь к картинке, которую необходимо отобразить на экране: ");
        String path = in.nextLine();

        //записываем изображение в переменную
        for (int i = 0; i < args.length; i++)
            path = args[i];

        Image img = new ImageIcon(path).getImage();

        //Вывод изображения
        g.drawImage(img, 0, 0, null);
    }
}
