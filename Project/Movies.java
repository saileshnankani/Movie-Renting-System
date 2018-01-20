//Filename: Movies.java
//Author: Joe Lin, Sailesh Nankani and Annie Sun
//Date: June 15, 2016
//Description: Movies compares the entered movie name with the existing ones on file and displays an respective window for renting.


import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;

/** Movies compares the entered movie name with the existing ones on file and displays an respective window for renting.
* @author Annie Sun, Joe Lin and Sailesh Nankani*/

class Movies extends JFrame {


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
    String info5[][];;
    
    /** Movies compares the entered movie name with the existing ones on file and displays an respective window for renting.
   * @param str       The name of the movie that the customer searches up.
   * @param str9      The String that is returned from KeyInput method that contains the String suitable for insertion.  
   * @param str2      The name of the customer.
   * @param info4     The 2 dimensional array that stores the records from external file, customers.txt.
   * @param info      The 2 dimesional array that stores the records from external file, movies.txt.   */
    public Movies(String str, String str9, String str2, String info4[][], String info[][]) {
        
        setSize(705, 622);  // better to use pack() (after components added)
        
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
        
        button1 = new JButton("Rent");
        
        
        
        panel2.setBackground(Color.RED);
        c.gridx=0;
        c.gridy=5;
    
        c.gridx=0;
        c.gridy=5;
        
        if (str.equals("Shrek"))
        {
            label = new ImageLabel(new ImageIcon("Images/shrekInfo.jpg"));
            setTitle("Shrek Movie Information");
        }
        if (str.equals("Deadpool"))
        {
            label = new ImageLabel(new ImageIcon("Images/deadpoolInfo.jpg"));
            setTitle("Deadpool Movie Information");
        }
        if (str.equals("Batman"))
        {
            label = new ImageLabel(new ImageIcon("Images/batmanInfo.jpg"));
            setTitle("Batman Movie Information");
        }
        if (str.equals("Frozen"))
        {
            label = new ImageLabel(new ImageIcon("Images/frozenInfo.jpg"));
            setTitle("Frozen Movie Information");
        }
        if (str.equals("Elf"))
        {
            label = new ImageLabel(new ImageIcon("Images/elfInfo.jpg"));
            setTitle("Elf Movie Information");
        }
        if (str.equals("Bounce"))
        {
            label = new ImageLabel(new ImageIcon("Images/bounceInfo.jpg"));
            setTitle("Bounce Movie Information");
        }
        if (str.equals("Titanic"))
        {
            label = new ImageLabel(new ImageIcon("Images/titanicInfo.jpg"));
            setTitle("Titanic Movie Information");
        }
         if (str.equals("Ted"))
         {
            label = new ImageLabel(new ImageIcon("Images/tedInfo.jpg"));
            setTitle("Ted Movie Information");
         }
      
        newRec = str9;
        
        panel2.add(button1);
        
        panel2.add(label);
        

     
        add(panel2);
        
         // make the GUI the minimum size needed to display the content
        setVisible(true);
        
        
        

        Handler3 H2 = new Handler3();
        button1.addActionListener(H2);
       } 
       
       
       private class Handler3 implements ActionListener 
       {
         


          public void actionPerformed(ActionEvent event)
         {
               String abc = String.format("Rent successful!", event.getActionCommand());
               nr.addRecord("customer.txt", newRec);
               JOptionPane.showMessageDialog(null, abc);
               dispose();
         }
         
         
         
      }
      
    public static void main(String[] args) {
        
        // GUIS should be constructed on the EDT.
        
        JFrame tt = new Movies(str, newRec, str2, info4, info);
        
        
    }
   
     

}