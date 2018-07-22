import javax.swing.*;
import java.awt.*;


public class GraphicsDemo extends Canvas{
    public void paint (Graphics g){
        g.setColor(Color.blue);                                 //Set Color
        g.drawRect(50,20,100,200);          //Draw Outline Rectangle (x position, y position, width size, height size)
        g.fillOval(160, 20, 100, 200);      //Draw and Fill oval (x pos, y pos, width siz, height siz)
        g.setColor(Color.red);
        g.fillRect(200,400,200,20);
        g.drawOval(200,430,200,100);

        g.setColor(Color.black);
        g.drawString("Graphics are pretty okay.", 500, 100);

    }

    public static void main(String[] args){
        //You can change the title or size here if you want.
        JFrame win = new JFrame("GraphicalDemo");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemo canvas = new GraphicsDemo();
        win.add(canvas);
        win.setVisible(true);
    }

}
