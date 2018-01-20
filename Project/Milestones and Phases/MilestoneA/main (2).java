import java.awt.*;
import javax.swing.*;

class main
{
   public static void main(String[] args)
   {
      //load login page
      LoginPage login = new LoginPage();
      login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      login.setSize(950, 600);
      login.setVisible(true);
      login.setLocationRelativeTo(null);

      //create menubar
      JMenuBar mb = new JMenuBar();
      login.setJMenuBar(mb);
   
      JMenu Sort = new JMenu("Sort");
      mb.add(Sort);
      
      JMenuItem sort1 = new JMenuItem("by name");
      JMenuItem sort2 = new JMenuItem("by rating");
      JMenuItem sort3 = new JMenuItem("by category");
      Sort.add(sort1);
      Sort.add(sort2);
      Sort.add(sort3);
      
      JMenu Help = new JMenu("Help");
      mb.add(Help);
      JMenuItem help1 = new JMenuItem("About");
      Help.add(help1);
   }
}