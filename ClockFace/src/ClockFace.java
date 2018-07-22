import java.awt.*;
import javax.swing.*;

public class ClockFace extends Canvas {
    public void paint(Graphics g){
        int xMiddle = 400;
        int yMiddle = 300;
        g.setColor(Color.black);

        g.drawOval(xMiddle - 100 , yMiddle - 200, 200, 200);
        g.setFont(new Font("Calibri", Font.BOLD, 16));
        g.drawString("12", xMiddle - 5, yMiddle-170);
        g.drawString("6", xMiddle-5, yMiddle - 10);

        g.drawString("9", xMiddle-90, yMiddle-90);
        g.drawString( "3", xMiddle+80, yMiddle-90);

        g.fillOval(xMiddle-5, yMiddle-100, 10,10);

        g.drawLine(xMiddle, yMiddle-90, xMiddle, yMiddle-160 );
        g.drawLine(xMiddle, yMiddle-95, xMiddle + 45, yMiddle-95);


    }
    public static void main(String[] args){
        JFrame win = new JFrame("ClockFace");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ClockFace canvas = new ClockFace();
        win.add(canvas);
        win.setVisible(true);
    }
}
