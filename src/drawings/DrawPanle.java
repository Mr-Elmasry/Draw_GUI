/*** @author Mr. Ahmed Elmasry 
 *   WWW.FanniaBackbone.wikispaces.com/java * */
package drawings;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawPanle extends JPanel{
    @Override
    public void paintComponent(Graphics g){
     g.setColor(Color.BLUE);     
//     g.drawRect(10, 10, 140, 140);
     g.fillRect(10, 10, 140, 140);  
     
     g.setColor(Color.red);
//      g.drawRect(220, 220, 200, 200);
       g.fillRect(150, 10, 140, 140);        
    }
    public static void main(String[] args) {
      JFrame f = new JFrame();      
      f.setBounds(140, 40, 800, 600);
      f.add(new DrawPanle());
      f.setVisible(true);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
