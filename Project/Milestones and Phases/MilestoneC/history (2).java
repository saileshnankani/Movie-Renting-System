import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;




class history extends JFrame {

    JTextField textField;
    JTextField textField2;
    JLabel lab;
    JLabel lab2;
    JPanel panel2;
    JPanel panel;
    JButton button1;
    JButton button2;

    public history() {
        setSize(700, 560);  // better to use pack() (after components added)
        
        JMenuBar mb = new JMenuBar();
        setJMenuBar(mb);
      
        JMenu Help = new JMenu("Sort");
        JMenu Help2 = new JMenu("Help");
        mb.add(Help);
        mb.add(Help2);
        JMenuItem helpSub11 = new JMenuItem("By Name");
        JMenuItem helpSub12 = new JMenuItem("By Year");
        JMenuItem helpSub13 = new JMenuItem("By Runtime");
        JMenuItem helpSub14 = new JMenuItem("By Ratings");
        
        JMenuItem helpSub21 = new JMenuItem("About");
        Help.add(helpSub11);
        Help.add(helpSub12);
        Help.add(helpSub13);
        Help.add(helpSub14);
        Help2.add(helpSub21); 
      
      

        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // better to use
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //setLocationRelativeTo(null);  // better to use..
        setLocationByPlatform(true);
        setTitle("Videos");
        setResizable(false);
        //setLayout(null); // better to use layouts with padding & borders
        textField = new JTextField(15);
        lab = new JLabel("New User (enter name)");
        lab.setForeground(Color.WHITE);
        lab.setFont(new Font("Serif", Font.BOLD, 25));
        lab2 = new JLabel("Return User (enter name)");
        lab2.setForeground(Color.WHITE);
        lab2.setFont(new Font("Serif", Font.BOLD, 25));
        
        
        textField.setFont(textField.getFont().deriveFont(25f));
        textField2 = new JTextField(15);
        textField2.setFont(textField2.getFont().deriveFont(25f));
        // set a flow layout with large hgap and vgap.
        panel = new JPanel(new GridBagLayout());
        // panel.setBounds(5, 5, 290, 290); // better to pack()
        GridBagConstraints c = new GridBagConstraints();
        GridBagConstraints d = new GridBagConstraints();
        c.insets = new Insets(80,80,15,15);
        c.gridx=0;
        c.gridy=0;
        panel.setBackground(Color.BLUE);
        c.gridx=0;
        c.gridy=1;

        
        d.insets = new Insets(5,5,5,5);
        d.gridx=0;
        d.gridy=0;
        d.gridx=0;
        d.gridy=1;
        
        
        ImageLabel label = new ImageLabel(new ImageIcon("batmanList.png"));
        ImageLabel label2 = new ImageLabel(new ImageIcon("shrekList.png"));
        ImageLabel label3 = new ImageLabel(new ImageIcon("deadpoolList.png"));
        ImageLabel label4 = new ImageLabel(new ImageIcon("frozenList.png"));
        label4.setLocation(555, 80);         
        ImageLabel label5 = new ImageLabel(new ImageIcon("elfList.png"));
        label5.setLocation(40, 280);
        ImageLabel label6 = new ImageLabel(new ImageIcon("bounceList.png"));
        label6.setLocation(212, 280);
        ImageLabel label7 = new ImageLabel(new ImageIcon("tedList.png"));
        label7.setLocation(383, 280);
        ImageLabel label8 = new ImageLabel(new ImageIcon("titanicList.png"));
        label8.setLocation(555, 280);
        //textField = new JTextField(); // suggest a size in columns
        
        //textField.setBounds(5, 5, 280, 50); // to get height, set large font
     
        panel.add(label);
        /**panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label5);
        panel.add(label6);
        panel.add(label7);
        panel.add(label8);
        
        */
        add(panel);
         // make the GUI the minimum size needed to display the content
        
        //Handler H1 = new Handler();
        //textField.addActionListener(H1);
        //textField2.addActionListener(H1);
        
        setVisible(true);

               
    }
    
    /**private class Handler implements ActionListener 
    {

      public void actionPerformed(ActionEvent event)
      {
         String string = "";
            
         if (event.getSource() == textField)
         {
            string = String.format("Welcome", event.getActionCommand());
            mainVideo mv = new mainVideo();
            dispose();
         }     
            //add user name to array function
            //string = txt.
            
            //load next page
               
               
         else if (event.getSource() == textField2)
         {
            choose chz = new choose();
            System.out.println("YES");
            dispose();
         }      
            //load next page
            //mainPage.setVisible(true);
               
            
      }
    }
   */

    public static void main(String[] args) {
        // GUIS should be constructed on the EDT.
        JFrame tt = new history();
        
        
    }
   
     

}