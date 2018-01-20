import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;

class movies extends mainVideo
{
   Shrek sr = new Shrek();


}



class Shrek extends JFrame {

    JTextField textField;
    JPanel panel2;
    
    JButton button1;
    JButton button2;

    public Shrek() {
        setSize(700, 560);  // better to use pack() (after components added)
        
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // better to use
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //setLocationRelativeTo(null);  // better to use..
        setLocationByPlatform(true);
        setTitle("Videos");
        setResizable(false);
        //setLayout(null); // better to use layouts with padding & borders
        textField = new JTextField(20);
        textField.setFont(textField.getFont().deriveFont(25f));
        // set a flow layout with large hgap and vgap.
      
        panel2 = new JPanel();
        // panel.setBounds(5, 5, 290, 290); // better to pack()
        GridBagConstraints c = new GridBagConstraints();
     
        panel2.setBackground(Color.BLUE);
        c.gridx=0;
        c.gridy=5;
    
        c.gridx=0;
        c.gridy=5;
        panel2.setBackground(Color.BLUE);
        
        ImageLabel label = new ImageLabel(new ImageIcon("shrekInfo.jpg"));
   
        
        
        
        panel2.add(label);
  


        //textField = new JTextField(); // suggest a size in columns
        
        //textField.setBounds(5, 5, 280, 50); // to get height, set large font
        
        
     
        add(panel2);
         // make the GUI the minimum size needed to display the content
        setVisible(true);
        
        //Handler H1 = new Handler();
        //textField.addActionListener(H1);
                
    }

    public static void main(String[] args) {
        // GUIS should be constructed on the EDT.
        JFrame tt = new Shrek();
        
        
    }
   
     

}