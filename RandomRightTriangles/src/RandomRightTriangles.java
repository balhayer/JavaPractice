import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomRightTriangles extends Canvas {

    public void paint(Graphics g) {
        Random ran = new Random();
        int myRed, myGreen, myBlue, x, y; //Red, Green, Blue, X position, Y position
        Polygon tri;
        Color ranColor;
        for (int i = 0; i < 500; i++) {
            tri = new Polygon();
            myRed = ran.nextInt(256);
            myGreen = ran.nextInt(256);
            myBlue = ran.nextInt(256);
            ranColor = new Color(myRed, myGreen, myBlue);

            x = ran.nextInt(800);
            y = ran.nextInt(600);
            tri.addPoint(x, y);
            tri.addPoint(x,y+50);
            tri.addPoint(x+50, y+50);
            g.setColor(ranColor);
            g.fillPolygon(tri);
        }
    }

    public static void main(String[] args) {
        JFrame win = new JFrame("RandomTriangle");
        win.setSize(800, 600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RandomRightTriangles canvas = new RandomRightTriangles();
        win.add(canvas);
        win.setVisible(true);
    }
}
