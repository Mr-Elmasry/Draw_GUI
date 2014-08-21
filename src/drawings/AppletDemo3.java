/*** @author Mr. Ahmed Elmasry 
 *   WWW.FanniaBackbone.wikispaces.com/java *  */
package drawings;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class AppletDemo3 extends Applet{

    @Override  
    public void paint(Graphics g) { 
       setSize(260, 260);
     
       int x1 = 30 , y1 = 30 , dim = 200;
       g.drawOval(x1, y1, dim, dim);
       g.setColor(Color.yellow);
       g.fillOval(x1, y1, dim, dim);
       g.setColor(Color.black);
//     g.fillOval(x1+dim/2, y1, 2, 2);
       g.fillOval(x1+dim/4, y1+dim/4, 20, 20);
       g.fillOval(x1+3*(dim/4), y1+dim/4, 20, 20);      
       
       g.drawArc(x1+dim/4, (dim/2), dim/2, dim/2, 225,90 );  
//       g.fillArc(x1+dim/4, (dim/2), dim/2, dim/2, 225,90);
    }

    @Override
    public void start() {
//        JOptionPane.showMessageDialog(this, "Started");
    }    
   
}
