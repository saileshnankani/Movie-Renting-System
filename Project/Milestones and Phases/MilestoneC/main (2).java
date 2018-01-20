import java.awt.*;
import javax.swing.*;

class main extends Frame
{
   public static void main(String[] args)
   {  
      //load login page
      //
      //
      
      LoginPage login = new LoginPage();
      login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      login.setSize(400, 200);
      login.setVisible(true);
      login.setResizable(true);
      login.setLocationRelativeTo(null);      
   }   
}
