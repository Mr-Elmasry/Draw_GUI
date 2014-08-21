/*** @author Mr. Ahmed Elmasry 
 *   WWW.FanniaBackbone.wikispaces.com/java *  */
package drawings;
import java.applet.Applet;
import java.awt.*;

public class AppletDemo2 extends Applet {
    
    @Override
    public void paint(Graphics g) {
        
        g.setColor(Color.red);
        //g.setFont(new Font("Forte", Font.ITALIC, 40));
        g.setFont(new Font("", Font.ITALIC, 30));
        // Draw a Line ; Represent The base Line Of A String;
        // the first point ;
        int x1 = 10, y1 = 40;
        // the last point ;
        int x2 = 800, y2 = y1;
        g.drawLine(x1, y1, x2, y2);        
        // Draw a String 
        g.setColor(Color.blue);
        g.drawString("Java is Simple.", x1, y1);
        g.drawLine(x1, y1*2, x2, y2*2);
        g.setColor(Color.black);         
        g.drawString("Java is OOP.", x1, y1*2);
    }
}
