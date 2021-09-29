package ru.mirea.task8.opt2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.util.Scanner;
import javax.swing.JPanel;

public class ShowImage extends JPanel {

    private static final long serialVersionUID = 1L;

    private BufferedImage image;

    public static final int WIDTH = 1000;
    public static final int HEIGHT = 900;

    public static void main(String avg[]) throws IOException {
        ShowImage abc = new ShowImage();

    }

    public ShowImage() {
        try {
            JFrame frame = new JFrame();
            System.out.println("Введите путь к картинке");
            Scanner in = new Scanner(System.in);
            String path;
            path = in.nextLine();
            image = ImageIO.read(new File(path));

            frame.setSize(WIDTH, HEIGHT);
            frame.setVisible(true);
            frame.getContentPane().add(this);
            this.setBackground(Color.BLACK);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null); // see javadoc for more info on the
        // parameters
    }

}