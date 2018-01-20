//Filename: SortMovies.java
//Author: Joe Lin, Sailesh Nankani and Annie Sun
//Date: June 15, 2016
//Description: SortMovies sorts the records from the external file customers.txt and displays it on the screen.


import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/** SortMovies sorts the records from the external file customers.txt and displays it on the screen.
* @author Annie Sun, Joe Lin and Sailesh Nankani*/


class SortMovies extends JFrame

{
   JTextArea textArea;
   
   JTextField textField;
   JTextField textField2;
   String m = "a";
   
   JLabel lab;
    JLabel lab2;
    JPanel panel2;
    JPanel panel3;
    JPanel panel;
    JButton button1;
    JButton button2;
    final int MAX = 20;
    String rows[] = new String[MAX];
    ReadData rd=new ReadData();
    ReadData2 rd2 = new ReadData2();
    Records re = new Records();
    static String fileName; 
    static String str;
    static String str4;
    static String info[][];
    Sorter s = new Sorter();
    Search2 f = new Search2();
    boolean test;
    JScrollPane pane;
    
    KeyInput ki = new KeyInput();
    static String fileName2;
    NewRecord nr = new NewRecord();
    Search5 d = new Search5();
    Search6 e = new Search6();
    static String newRec2;
    static int item;
    String info3[][] = new String[MAX][5];
    String info4[][] = new String[MAX][5];
    String items[] = new String[6];
    String rows2[] = new String[MAX];
    String newRec;
    String abc;
    String str2 ="";
    JButton close;
    
   
   /** SortMovies sorts the records from the external file customers.txt and displays it on the screen.
   * @param info               The 2 dimensional array containing the records from movies.txt.
   * @param item                The integer to determine the category that needs to be searched up. */
   
   public SortMovies(String info[][], int item)
   {
      setSize(700, 560);        

        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setTitle("Sorter");
        setResizable(false);
        textArea = new JTextArea(20,50);
        pane = new JScrollPane(textArea);
        pane.setBounds(50, 240, 50, 50);

        lab = new JLabel("New User (e.g. John, Smith)");
        lab.setForeground(Color.WHITE);
        lab.setFont(new Font("Serif", Font.BOLD, 25));
        lab2 = new JLabel("Sorted Movies");
        lab2.setForeground(Color.WHITE);
        lab2.setFont(new Font("Serif", Font.BOLD, 25));
        panel = new JPanel(new GridBagLayout());
        close = new JButton("Close");
        GridBagConstraints c = new GridBagConstraints();
        GridBagConstraints d = new GridBagConstraints();
        GridBagConstraints e = new GridBagConstraints();
        
        c.insets = new Insets(80,80,15,15);
        c.gridx=0;
        c.gridy=0;
        panel.setBackground(Color.BLUE);
        //pane.setHorizontalScrollBarPolicy;

        
        m = "";
        String p = "";
        
        for (int k=0; k<info.length; k++)
        {
        for (int b=0; b<info[0].length; b++)
        {
            
            p = p + info[k][b]+"\t";
            
          
        }
        p = p + "\n";
        }
        
        
        textArea.setText("-------------------------------------------------------------------------------------------------------------------------------------" + "\n"+"Category"+"\t"+"Movie"+"\t"+"Year"+"\t"+"Ratings"+"\t"+"Runtime"+"\n" + "--------------------------------------------------------------------------------------------------------------------------------------"+"\n"+p);
        panel.add(pane);
        
        c.gridx=0;
        c.gridy=1;
        
        d.insets = new Insets(5,5,5,5);
        d.gridx=0;
        d.gridy=0;
        panel.add(lab,d);
        d.gridx=0;
        d.gridy=1;
        panel.add(lab2,d);

        e.insets = new Insets(5,5,5,5);
        e.gridx=0;
        e.gridy=3;
        panel.add(close,e);
         
        add(panel);
        
        setVisible(true);
        Handler4 H1 = new Handler4();
        close.addActionListener(H1);
   
   }
   
   private class Handler4 implements ActionListener 
    {
      

      /* Method that reads the user input, initializes the String to be inserted and redirects to renting interface. */
      public void actionPerformed(ActionEvent event)
      {
         String string = "";
            
         if (event.getSource() == close)
         {
            
            dispose();
            

         }
       
     }

   }
   public static void main(String []args)
   {
      JFrame pp = new SortMovies(info, item);
   }
   

} 
