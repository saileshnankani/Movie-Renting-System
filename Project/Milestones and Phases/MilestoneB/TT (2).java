import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;

class mainVideo extends JFrame {

    JTextField textField;
    JPanel panel2;
    JPanel panel;
    JButton button1;
    JButton button2;

    public mainVideo() {
        setSize(700, 560);  // better to use pack() (after components added)
        
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // better to use
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //setLocationRelativeTo(null);  // better to use..
        setLocationByPlatform(true);
        setTitle("Videos");
        setResizable(true);
        //setLayout(null); // better to use layouts with padding & borders
        textField = new JTextField(20);
        textField.setFont(textField.getFont().deriveFont(25f));
        // set a flow layout with large hgap and vgap.
        panel = new JPanel(new GridBagLayout());
        panel2 = new JPanel();
        // panel.setBounds(5, 5, 290, 290); // better to pack()
        GridBagConstraints c = new GridBagConstraints();
        panel.setBackground(Color.BLUE);
        panel2.setBackground(Color.BLUE);
        c.gridx=0;
        c.gridy=5;
        panel.add(textField, c);
        c.gridx=0;
        c.gridy=5;
        panel2.setBackground(Color.BLUE);
        
        ImageLabel label = new ImageLabel(new ImageIcon("batman.jpg"));
        ImageLabel label2 = new ImageLabel(new ImageIcon("shrek.jpg"));
        ImageLabel label3 = new ImageLabel(new ImageIcon("deadpool.jpg"));
        ImageLabel label4 = new ImageLabel(new ImageIcon("frozen.jpg"));
        label4.setLocation(555, 80);
        ImageLabel label5 = new ImageLabel(new ImageIcon("elf.jpg"));
        label5.setLocation(40, 280);
        ImageLabel label6 = new ImageLabel(new ImageIcon("bounce.jpg"));
        label6.setLocation(212, 280);
        ImageLabel label7 = new ImageLabel(new ImageIcon("ted.jpg"));
        label7.setLocation(383, 280);
        ImageLabel label8 = new ImageLabel(new ImageIcon("titanic.jpg"));
        label8.setLocation(555, 280);
        
        
        
        panel2.add(label);
        panel2.add(label2);
        panel2.add(label3);
        panel2.add(label4);
        panel2.add(label5);
        panel2.add(label6);
        panel2.add(label7);
        panel2.add(label8);


        //textField = new JTextField(); // suggest a size in columns
        
        //textField.setBounds(5, 5, 280, 50); // to get height, set large font
        
        
        add(panel, BorderLayout.SOUTH);
        add(panel2);
         // make the GUI the minimum size needed to display the content
        setVisible(true);
        
        
                
    }

    public static void main(String[] args) {
        // GUIS should be constructed on the EDT.
        JFrame tt = new mainVideo();
        
        
    }
   
     

}