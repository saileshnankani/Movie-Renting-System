import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;




class movies extends JFrame {

    JTextField textField;
    JPanel panel2;
    
    JButton button1;
    JButton button2;
    ImageLabel label;
    
    public movies(String str) {
        
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
        if (str.equals("Shrek"))
            label = new ImageLabel(new ImageIcon("shrekInfo.jpg"));
        if (str.equals("Deadpool"))
            label = new ImageLabel(new ImageIcon("deadpoolInfo.jpg"));
        if (str.equals("Batman"))
            label = new ImageLabel(new ImageIcon("batmanInfo.jpg"));
        if (str.equals("Frozen"))
            label = new ImageLabel(new ImageIcon("frozenInfo.jpg"));
        if (str.equals("Elf"))
            label = new ImageLabel(new ImageIcon("elfInfo.jpg"));
        if (str.equals("Bounce"))
            label = new ImageLabel(new ImageIcon("bounceInfo.jpg"));
        if (str.equals("Titanic"))
            label = new ImageLabel(new ImageIcon("titanicInfo.jpg"));
         if (str.equals("Ted"))
            label = new ImageLabel(new ImageIcon("tedInfo.jpg"));
   
        
        
        
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