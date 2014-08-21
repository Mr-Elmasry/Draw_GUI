/*** @author Mr. Ahmed Elmasry 
 *   WWW.FanniaBackbone.wikispaces.com/java * */
package drawings;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIDemo {
   private JFrame mainFrame;
   private JLabel lblHeader;
   private JLabel lblStatus;
   
   public GUIDemo(){
      prepareGUI();
   }

   public static void main(String[] args){
      GUIDemo gui = new GUIDemo();  
      gui.showEventDemo();       
   }
      
   private void prepareGUI(){
      mainFrame = new JFrame("Java SWING Examples");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new FlowLayout());
      lblHeader = new JLabel("",JLabel.CENTER );
      lblStatus = new JLabel("", JLabel.LEFT);
      lblStatus.setSize(350,100); 
      


      mainFrame.add(lblHeader);
      mainFrame.add(lblStatus);
      mainFrame.setVisible(true);      
      mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
   }

   private void showEventDemo(){
      lblHeader.setText("Control in action: Button"); 

      JButton okButton = new JButton("OK");
      

//      okButton.setActionCommand("OK");
      okButton.addActionListener(new BCListener()); 

      
     mainFrame.add(okButton,JButton.LEFT);
     mainFrame.setVisible(true);  
   }

   private class BCListener implements ActionListener{
      @Override
      public void actionPerformed(ActionEvent e) {
         
          lblStatus.setText("Ok has been Pressed!");
      }		
   }
}
