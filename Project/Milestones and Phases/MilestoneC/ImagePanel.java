/*
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


class sample extends JFrame {

    JTextField textField;
    JPanel panel2;
    JPanel panel;
    JButton button1;
    JButton button2;
    static final int MAX = 20;
    static String fileName2, input;
    static String info3[][] = new String[MAX][5];
    String info4[][] = new String[MAX][5];
    static String items[] = new String[6];
    static int item;
    static String newRec2;
    static String txt;
    
    
   

    public sample(String fileName2,String info3[][], int item, String txt) {
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
        System.out.println("");
        System.out.println("XXXXX");
        System.out.println(info3[1][2]);
        info4[1][2] = info3[1][2];
        System.out.println(info4[1][2]);
        System.out.println("XXXXX");
        System.out.println("");
        for (int a =0; a<info3.length; a++)
         {
            for (int b=0; b<info4[a].length; b++)
            {
               info4[a][b] = info3[a][b];
            }
         }
        
        System.out.println(info4[5][2]);
       

        //textField = new JTextField(); // suggest a size in columns
        
        //textField.setBounds(5, 5, 280, 50); // to get height, set large font
        
        
        add(panel, BorderLayout.SOUTH);
        add(panel2);
        
         // make the GUI the minimum size needed to display the content
        setVisible(true);
        
        Handler H1 = new Handler();
        textField.addActionListener(H1);
                
    }
    

   private class Handler implements ActionListener 
    {
      
      public void actionPerformed(ActionEvent event)
      {
         
         Search5 d = new Search5();
         String string = "";
         String str = textField.getText();
         System.out.println(str);
         newRec2 = d.searching(fileName2, info4, item, str);
         
         
         txt += newRec2;
         System.out.println(txt);
         
         System.out.println("\nNew record complete.");
         
         string = String.format("Welcome", event.getActionCommand());
         movies mv = new movies(str);
         }

      
      
         //}  
         /**if (str.equals("Shrek"))
         {
            
            string = String.format("Welcome", event.getActionCommand());
            movies mv = new movies();
            dispose();
         }    
            //add user name to array function
            //string = txt.
            
            //load next page
               
               
        
    }

     public static void main(String[] args) {
        // GUIS should be constructed on the EDT.
        JFrame tt = new sample(fileName2,info3, item, txt);
        
        
    }
   
     

}

*/

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel{

    private BufferedImage image;

    public ImagePanel() {
       try {                
          image = ImageIO.read(new File("image name and path"));
       } catch (IOException ex) {
            // handle exception...
       }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null); // see javadoc for more info on the parameters            
    }
    
    public static void main(String[] args) {
        // GUIS should be constructed on the EDT.
        new ImagePanel();
        
        
    }

}