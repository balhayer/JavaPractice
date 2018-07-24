import java.awt.*;
import javax.swing.*;
import java.io.File;
import javax.imageio.ImageIO;

public class MotivationPoster extends Canvas {
    Image poster;
    public MotivationPoster() throws Exception{
        poster = ImageIO.read(new File("ImageDemo.jpg"));
    }

    public void paint(Graphics g){
        g.drawImage(poster, 50,50,this);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Times New Roman", Font.BOLD, 32));
        g.drawString("Possible", 50,270);
        g.setFont(new Font("Century Gothic", Font.PLAIN, 24));
        g.drawString("Don't let failure stop you from success.", 50,300);

    }
    public static void main(String[] args) throws Exception{
        MotivationPoster canvas = new MotivationPoster();
        canvas.setBackground(Color.DARK_GRAY);
        JFrame win = new JFrame("MotivationPoster");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(canvas);
        win.setVisible(true);

    }
}
