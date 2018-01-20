import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class LoginPage extends JFrame
{
   public JTextField newUser;
   public JTextField returnUser;
   private JLabel u1;
   private JLabel u2;
   private JPanel p;
   private JFrame f;
   
   public LoginPage()
   {
      super("Video Rental - Login Page"); 
   
      

      //create menubar
      JMenuBar mb = new JMenuBar();
      setJMenuBar(mb);
   
      JMenu Help = new JMenu("Help");
      mb.add(Help);
      JMenuItem help1 = new JMenuItem("About");
      Help.add(help1); 
      
      
        
      u1 = new JLabel("Search");
      u2 = new JLabel("Return User");
      
      
      
      //create text field 
      newUser = new JTextField(20);

      
      //add
      add(u1, BorderLayout.SOUTH);
      add(newUser, BorderLayout.SOUTH);
      add(u2);
      
      //handler
      Handler H1 = new Handler();
      newUser.addActionListener(H1);
   
   }
      
      
   private class Handler implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         String string = "";
            
         if (event.getSource() == newUser)
            string = String.format("Search", event.getActionCommand());
               
            //add user name to array function
            //string = txt.
            
            //load next page
               
               
         else if (event.getSource() == returnUser)
            string = String.format("welcome back", event.getActionCommand());
               
            //load next page
            //mainPage.setVisible(true);
               
               
         JOptionPane.showMessageDialog(null, string);
      }
   }
   
   public static void main(String[] args)
   {  
      new LoginPage();
      
      
      
   }  
}