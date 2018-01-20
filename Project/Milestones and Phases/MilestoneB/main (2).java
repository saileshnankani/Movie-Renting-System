import java.awt.*;
import javax.swing.*;
import java.awt.FlowLayout;

class main extends JFrame
{

   private JFrame f;
   private JPanel p;
   private JPanel j;
   private JButton b1;
   private JLabel lab;
   private JTextField tf;
   
   
   public main()
   {
      video2();
      
      

   }
   
   public void video2()
   {
      
      f = new JFrame("Videos");
      f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      f.setLocationByPlatform(true);
      f.setVisible(true);
      f.setSize(700,560);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      f.add(p);
      
      p = new JPanel(new FlowLayout(SwingConstants.LEADING, 10, 10));  
      tf = new JTextField(20);  
      tf.setFont(tf.getFont().deriveFont(50f));  
      b1 = new JButton("Enter");
      lab = new JLabel("This is a test label.");
      p.setBackground(Color.BLUE);
      
     
      p.add(b1);
      p.add(lab);
      p.add(tf);

     
               
      
      pack();
      setVisible(true);
   }



   public static void main(String[] args)
   {  
      new main();
      
   }   
}
