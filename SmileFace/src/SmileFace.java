import java.awt.*;
import javax.swing.*;


public class SmileFace extends Canvas{

    public void paint(Graphics g){
        Color myFace = new Color(111, 104, 47);
        Color myEyes = new Color(0,0,100);
        Color myMouth = new Color(206, 206, 206);
        g.setColor(myFace);

        g.fillOval(200,20,300,300);
        g.setColor(myEyes);
        g.fillOval( 250, 150, 40, 40 );
        g.fillOval(450, 150, 40, 40);
        g.setColor(myMouth);
        g.fillArc(330, 170, 90 , 90, 180, 180);



    }

    public static void main(String[] args){
        JFrame win = new JFrame("SmileFace");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SmileFace canvas = new SmileFace();
        win.add(canvas);
        win.setVisible(true);
    }
}
