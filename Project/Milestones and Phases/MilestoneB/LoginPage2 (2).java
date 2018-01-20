import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class LoginPage2 extends JFrame
{
   public JTextField newUser;
   public JTextField returnUser;
   private JLabel u1;
   private JLabel u2;
   
   public LoginPage2()
   {
      super("Video Rental - Login Page");
      setLayout(new FlowLayout());
      
      
      //create menubar
      JMenuBar mb = new JMenuBar();
      setJMenuBar(mb);
   
      JMenu Help = new JMenu("Help");
      mb.add(Help);
      JMenuItem help1 = new JMenuItem("About");
      Help.add(help1);  
       
      /*
      public boolean action(Event evt, Object obj) 
      {    
         if(evt.target instanceof MenuItem)
         {
            String label = (String) obj;
                  
            if (label.equals("Load3"))
            {
               rows= rd3.readFile(fileName3,10);     //Calls readFile method
               info= re.getRecords(rows);          //Calls getRecords method
               System.out.println();
            }         
                    
            else if (label.equals("New")) 
            {          
               nr2.addRecord(fileName3, ki2.entries());
            }
        }
        return true;
        
      }// end action 
      */
      
      
      //create text
      u1 = new JLabel("New User");
      u2 = new JLabel("Return User");
      
      
      
      //create text field 
      newUser = new JTextField(30);
      /*
      setLayout(new BorderLayout());
      newUser.setBounds(100, 75, 30, 20);
      */
      returnUser = new JTextField(30);
      /*
      setLayout(new BorderLayout());
      returnUser.setBounds(350, 300,250,40);
      */     
      
      //add
      add(u1);
      add(newUser);
      add(u2);
      add(returnUser);
      
      //handler
      Handler H1 = new Handler();
      newUser.addActionListener(H1);
      returnUser.addActionListener(H1);
      
   }
      
      
   private class Handler implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         String string = "";
            
         if (event.getSource() == newUser)
            string = String.format("new user created", event.getActionCommand());
               
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
}