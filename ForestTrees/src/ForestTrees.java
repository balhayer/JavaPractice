import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class ForestTrees extends Canvas{
    Color myBrown = new Color(165,42,42);
     Random r = new Random();

    public void paint(Graphics g){
        drawTree(g, 100, 150);
        drawForest(g, 200,400, 500,300);
    }
    public void drawTree(Graphics g, int x, int y){
        //Drawing Tree Triangle
        g.setColor(Color.BLACK);
        Polygon tri = new Polygon();
        tri.addPoint(x+25,y);
        tri.addPoint( x,y+75);
        tri.addPoint(x+50,y+75);
        g.setColor(Color.GREEN);
        g.fillPolygon(tri);

        //Drawing Trunk
        g.setColor(myBrown);
        g.fillRect(x+17,y+75,16,50);


    }
    public void drawForest(Graphics g, int x, int y, int w, int h){
        int randX;
        int randY;
        g.drawRect(x,y,w,h);
        for(int i=0; i < 50; i++){
            randX = r.nextInt(w-75) + x + 25;
            randY = r.nextInt(h-125) + y;

            drawTree(g,randX, randY);
        }
    }
    public static void main(String[] args){
        Canvas canvas = new ForestTrees();
        JFrame win = new JFrame("ForestTrees - RANDY LE");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(canvas);
        win.setVisible(true);
    }

}
