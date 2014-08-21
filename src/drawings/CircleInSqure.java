/*** @author Mr. Ahmed Elmasry 
 *   WWW.FanniaBackbone.wikispaces.com/java *  */
// From Java Graphical Approach - Page : 43;
package drawings;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JApplet;

public class CircleInSqure extends JApplet {

    @Override
    public void paint(Graphics g) {

        final int X = 50, Y = 50, SIZE = 100;

        g.setColor(Color.red);
        g.fillRect(X, Y, SIZE, SIZE);
        g.setColor(Color.yellow);
        g.fillOval(X, Y, SIZE, SIZE);
        g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.BOLD, 13));
        g.drawString("FIGURE 1.3 yellow circle inside a black square.",
                X, Y + SIZE + 20);
    }

}
