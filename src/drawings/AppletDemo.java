/*** @author Mr. Ahmed Elmasry 
 *   WWW.FanniaBackbone.wikispaces.com/java *  */
package drawings;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
/*<applet> code = "AppletDemo" width = 600 height = "450" <\applet>*/
public class AppletDemo extends Applet{
    @Override
    public void paint(Graphics g){
        setBackground(Color.lightGray);
//        setBounds(40, 40, 600, 300);        
        
        g.setFont(new Font("Forte", Font.BOLD, 20));
        g.setColor(Color.red);
        
        g.drawString("Welcome : Drawing is Fun", 30, 30);
//        g.drawLine(30, 30, 300, 30);//The base line of above String
        g.drawLine(0, 240, 240, 240);
       // g.drawLine(0, 10, 10, 150);
        
        g.setColor(Color.black);      
        g.drawRect(40, 40, 100, 200);        
        //g.fillRect(40, 40, 100, 200);
        

        g.setColor(Color.yellow);
        g.drawOval(150, 40, 200, 200);
        g.fillOval(150, 40, 200, 200);
    }       
}
