import java.awt.*;
import javax.swing.*;

public class GraphicsDemoThree extends Canvas {
    public void paint(Graphics g){
        //lines
        g.setColor(Color.green);
        g.drawLine(10, 100, 400, 100);

        g.setColor(Color.black);
        g.drawLine(50,150,100,180);

        //fonts
        g.drawString("Hello World", 500, 100);
        g.setFont(new Font("Consolas", Font.PLAIN, 36)); //36pt plain consolas font
        g.drawString("Hello World", 400, 200);

        g.setFont(new Font("Calibri", Font.BOLD+Font.ITALIC, 60)); //60pt italic bold
        g.drawString("Randy Le", 290, 360);

        g.setColor(Color.blue);
        g.setFont(Font.decode("Calibri-BOLDITALIC-60")); //a different way to specify the same font
        g.drawString("Randy Le", 400, 450);

        g.setFont(new Font(null)); //restore default font
    }
    public static void main(String[] args){
        JFrame win = new JFrame("GraphicsDemoThree");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemoThree canvas = new GraphicsDemoThree();
        win.add(canvas);
        win.setVisible(true);
    }

}
