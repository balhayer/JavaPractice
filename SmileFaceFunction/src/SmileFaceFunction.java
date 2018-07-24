import java.awt.*;
import javax.swing.*;


public class SmileFaceFunction extends Canvas{
    public void paint(Graphics g){
        smilyFace(g, 200,200,300,300);
        smilyFace(g, 50,50,100,100);
    }
    public void smilyFace(Graphics g, int x, int y, int w, int h){

        //Face
        g.setColor(Color.DARK_GRAY);
        g.fillOval(x,y, w, h);
        //Left Eye
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(x+(w/4),y+(3*h/8), w/8,h/8);
        g.fillOval(x+(3*w/4), y+(3*h/8), w/8,h/8);

        //Mouth
        g.setColor(Color.black);
        g.fillArc(x+(3*w/8),y+h/2,w/3,h/3,180,180);
    }

    public static void main(String[] args){
        Canvas canvas = new SmileFaceFunction();
        canvas.setBackground(Color.BLUE);
        JFrame win = new JFrame("SmileFaceFunction - RANDY LE");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(canvas);
        win.setVisible(true);
    }
}
