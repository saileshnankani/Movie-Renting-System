import java.awt.*;
import javax.swing.*;

class main1 extends Frame
{
   public static void main1(String[] args)
   {  
      //load login page
      //
      //
      
      LoginPage2 login = new LoginPage();
      login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      login.setSize(400, 200);
      login.setVisible(true);
      login.setResizable(false);
      login.setLocationRelativeTo(null);      
   }   
}
