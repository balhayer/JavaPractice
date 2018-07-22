import java.awt.*;
import javax.swing.*;

public class BoringTriangle extends Canvas{
    public void paint(Graphics g){
        Color myPurple = new Color(147,112,219);
        g.setColor(Color.black);
        Polygon tri = new Polygon();
        tri.addPoint(50,50);
        tri.addPoint(50,200);
        tri.addPoint(150,200);

        g.setColor(myPurple);
        g.fillPolygon(tri);
    }
    public static void main(String[] args){
        JFrame win = new JFrame("BoringTriangle");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BoringTriangle canvas = new BoringTriangle();
        win.add(canvas);
        win.setVisible(true);
    }
}
