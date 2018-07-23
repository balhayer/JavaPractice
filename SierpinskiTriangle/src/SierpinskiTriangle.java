import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class SierpinskiTriangle extends Canvas{
    Random r = new Random();
    int rand;

    /*Create three vertices (512,109), (146,654), (876, 654)
    * x1 is half the width of the screen (512)
    * y1 is 1/7 the height of the screen (109)
    * x2 is 1/7 the width of the screen (146)
    * y2 & y3 is 6/7 the height of the screen (654)
    * x3 is 6/7 the width of the screen (876)
    */
    int x1 = 512, y1 = 109, x2 = 146, y2 = 654, x3 = 876, y3 = 654;

    int x = 512, y = 382; //Current position

    int dx = 0, dy = 0;  //The distance difference
    public void paint(Graphics g){

        for(int i = 0; i < 50000; i ++){
            g.drawLine(x,y,x,y);
            try{
                Thread.sleep(1);
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }

            rand = r.nextInt(3) + 1;
            if(rand == 1){
                dx = x - x1;
                dy = y - y1;
            }
            else if(rand == 2){
                dx = x - x2;
                dy = y - y2;
            }
            else if(rand == 3){
                dx = x - x3;
                dy = y - y3;
            }
            else System.out.print("ERROR HAS OCCURRED: 001");

            x = x - dx/2;
            y = y - dy/2;
        }

    }
    public static void main(String[] args){
        JFrame win = new JFrame("SierpinskiTriangle");
        win.setSize(1024,768); //WIDTH of 1024 and HEIGHT of 768
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new SierpinskiTriangle());
        win.setVisible(true);
    }
}
