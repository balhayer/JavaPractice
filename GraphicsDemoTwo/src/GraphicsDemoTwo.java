import java.awt.*;
import javax.swing.JFrame;


public class GraphicsDemoTwo extends Canvas {
    public void paint(Graphics g){
        g.setColor(Color.black);

        //arcs
        g.drawArc(270,0,100, 200, 0, 270); // drawing an ar that starts at 0 degrees and has an arc length of 270
                                                                                   // (x pos, y pos, width, height, startAngle, arcAngle
        g.drawArc(210,250,150,150,45,90);

        //fill arcs
        g.fillArc(210,280,150,150,0,90);

        //custom colors
        Color myOrange = new Color(230,92,0); //amount of red,green,blue in the color from 0 - 255
        g.setColor(myOrange);
        g.fillOval(500,50,150,150);

        Color myGrey = new Color(114, 107, 111);
        g.setColor(myGrey);
        g.fillRect(500,210,150,150);
    }
    public static void main(String[] args){
        JFrame win = new JFrame("GraphicDemoTwo");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemoTwo canvas = new GraphicsDemoTwo();
        win.add(canvas);
        win.setVisible(true);
    }
}
