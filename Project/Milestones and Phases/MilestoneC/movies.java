import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;




class movies extends JFrame {


    JTextField textField;
    JPanel panel2;
    
    JButton button1;
    JButton button2;
    ImageLabel label;
    static String str;
    static String newRec;
    static String str2;
    static String info4[][];
    static String txt;
    static String lastName;
    static String info[][];
    NewRecord nr = new NewRecord();
    String fileName = new String();
    Output ou = new Output();
    
    
    public movies(String str, String newRec, String str2, String info4[][], String info[][]) {
        
        setSize(715, 622);  // better to use pack() (after components added)
        
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
      
        panel2 = new JPanel();
        // panel.setBounds(5, 5, 290, 290); // better to pack()
        GridBagConstraints c = new GridBagConstraints();
        
        button1 = new JButton("Rent");
        
        
        
        panel2.setBackground(Color.RED);
        c.gridx=0;
        c.gridy=5;
    
        c.gridx=0;
        c.gridy=5;
        
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
   
        
        panel2.add(button1);
        
        panel2.add(label);
        
  


        //textField = new JTextField(); // suggest a size in columns
        
        //textField.setBounds(5, 5, 280, 50); // to get height, set large font
        
        
     
        add(panel2);
         // make the GUI the minimum size needed to display the content
        setVisible(true);
        
        button1.addActionListener( new ActionListener()
        {
        public void actionPerformed(ActionEvent f)
        {
            nr.addRecord("customers.txt", newRec);
            try 
            {
               String lastName = str.substring(0, str.indexOf(","));
               String firstName = str.substring(str.indexOf(" ") +1);
               txt = lastName+" "+firstName; 
            }  catch(Exception e) {}
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            
            System.out.println(txt);
            
            
            
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
              
            ou.keyIn(info, txt);
            //

            //
        }
        });
     
    }

    
    public static void main(String[] args) {
        
        // GUIS should be constructed on the EDT.
        
        JFrame tt = new movies(str, newRec, str2, info4, info);
        
        
    }
   
     

}