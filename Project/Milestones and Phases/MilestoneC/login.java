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




class login extends JFrame {

    JTextField textField;
    JTextField textField2;
    JTextField textField3;
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
    
    
    KeyInput ki = new KeyInput();
    static String fileName2;
    NewRecord nr = new NewRecord();
    Search5 d = new Search5();
    Search6 e = new Search6();
    static String newRec2;
    int item;
    String info3[][] = new String[MAX][5];
    String info4[][] = new String[MAX][5];
    String items[] = new String[6];
    String info[][]= new String[MAX][6];
    String rows2[] = new String[MAX];
    String newRec;
    String abc;
   
    static String txt, input, searchMovie;
    // static String info3[][] = new String[MAX][5];
    
    public login() {
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
        lab = new JLabel("New User (e.g. Smith, John)");
        lab.setForeground(Color.WHITE);
        lab.setFont(new Font("Serif", Font.BOLD, 25));
        lab2 = new JLabel("Return User (e.g. Smith John)");
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
        panel.add(textField,c);
        c.gridx=0;
        c.gridy=1;
        panel.add(textField2,c);
        
        d.insets = new Insets(5,5,5,5);
        d.gridx=0;
        d.gridy=0;
        panel.add(lab,d);
        d.gridx=0;
        d.gridy=1;
        panel.add(lab2,d);

        


        //textField = new JTextField(); // suggest a size in columns
        
        //textField.setBounds(5, 5, 280, 50); // to get height, set large font
        
        
        add(panel);
                
        
         // make the GUI the minimum size needed to display the content
        
        Handler H1 = new Handler();
        textField.addActionListener(H1);
        textField2.addActionListener(H1);
        
        
        
        
        setVisible(true);
        
        
        
               
    }
    
    private class Handler implements ActionListener 
    {

      public void actionPerformed(ActionEvent event)
      {
         String string = "";
         System.out.println(abc);
         
         System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            for (int p=0; p<info.length; p++)
            {
               for (int k=0; k<info[p].length; k++)
               {
                  System.out.print(info[p][k]+"\t");
                  
               }
               System.out.println();
            }
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            
         if (event.getSource() == textField)
         {
            
            string = String.format("Welcome", event.getActionCommand());
            String str = textField.getText();
            System.out.println(str);
            rows =rd.readFile(fileName,10);
            info =re.getRecords(rows);
            System.out.println();
            System.out.println(abc);
            
            rows2 =rd2.readFile(fileName2, 8);
            info3= re.getRecords(rows2);
            System.out.println();
            newRec= ki.entries(fileName, fileName2, str, info3, 1);
            pictures(str);
                        
         }     

               
               
         else if (event.getSource() == textField2)
         {
                 
            rows =rd.readFile(fileName,10);
            info =re.getRecords(rows);
            System.out.println();
            System.out.println(abc);
            
            rows2 =rd2.readFile(fileName2, 8);
            info3= re.getRecords(rows2);
            System.out.println();

            String str4 = textField2.getText();
            item = 0;
            boolean found;
            
            found = e.searching(fileName, info, item, str4);
            if (found)
            {  
               int item =0;
               choose chz = new choose(fileName, info, item, str4);
               pictures(str);
            }
            
            else if (!found)
            {
               string = String.format("Sorry, no record found.", event.getActionCommand());

               JOptionPane.showMessageDialog(null, string);
            }
            
         }      

               
            
      }
    }
    
    public String pictures(String str)
    {
    
             panel.removeAll();
            //panel.revalidate();
            //panel.repaint();
            ImagePanel imgPnl = new ImagePanel();
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
         
            ImageLabel label = new ImageLabel(new ImageIcon("batman2.jpg"));
            ImageLabel label2 = new ImageLabel(new ImageIcon("Capture.jpg"));
            ImageLabel label3 = new ImageLabel(new ImageIcon("shrek.jpg"));
            ImageLabel label4 = new ImageLabel(new ImageIcon("Capture.jpg"));
            ImageLabel label5 = new ImageLabel(new ImageIcon("deadpool.jpg"));
            ImageLabel label6 = new ImageLabel(new ImageIcon("Capture.jpg"));
            ImageLabel label7 = new ImageLabel(new ImageIcon("frozen.jpg"));
            
            label4.setLocation(555, 80);
            ImageLabel label9 = new ImageLabel(new ImageIcon("elf2.jpg"));
            ImageLabel label10 = new ImageLabel(new ImageIcon("Capture.jpg"));
            label5.setLocation(40, 280);
            ImageLabel label11 = new ImageLabel(new ImageIcon("bounce.jpg"));
            ImageLabel label12 = new ImageLabel(new ImageIcon("Capture.jpg"));
            label6.setLocation(212, 280);
            ImageLabel label13 = new ImageLabel(new ImageIcon("ted.jpg"));
            ImageLabel label14 = new ImageLabel(new ImageIcon("Capture.jpg"));
            label7.setLocation(383, 280);
            ImageLabel label15 = new ImageLabel(new ImageIcon("titanic.jpg"));
            ImageLabel label16 = new ImageLabel(new ImageIcon("Capture.jpg"));
            ImageLabel label17 = new ImageLabel(new ImageIcon("Capture2.jpg"));
            ImageLabel label18 = new ImageLabel(new ImageIcon("Capture2.jpg"));
            ImageLabel label19 = new ImageLabel(new ImageIcon("Capture2.jpg"));
            ImageLabel label20 = new ImageLabel(new ImageIcon("Capture2.jpg"));
            
            
        
        
              panel2.add(label16);
              panel2.add(label);
              panel2.add(label2);
              panel2.add(label3);
              panel2.add(label4);
              panel2.add(label5);
              panel2.add(label6);
              panel2.add(label7);
      
              panel2.add(label9);
              panel2.add(label10);
              panel2.add(label11);
              panel2.add(label12);
              panel2.add(label13);
              panel2.add(label14);
              panel2.add(label15);
              panel2.add(label16);
              
              for (int a =0; a<info3.length; a++)
               {
                  for (int b=0; b<info4[a].length; b++)
                  {
                     info4[a][b] = info3[a][b];
                  }
               }
              
              
              
              System.out.println(info4[5][2]);
              add(panel2);
              add(panel, BorderLayout.SOUTH);
              setVisible(true);
              
              Handler2 H2 = new Handler2();
              textField.addActionListener(H2);
              
              return newRec;
    
    }    


  
    private class Handler2 implements ActionListener 
    {
      


      public void actionPerformed(ActionEvent event)
      {
         String string = "";
            
         if (event.getSource() == textField)
         {

            
              
            String str2 = textField.getText();
            newRec2 = d.searching(fileName2, info4, item, str2);
            newRec += newRec2;
            System.out.println(newRec);
  

            
            movies mv = new movies(str2, newRec, str, info4, info);
            

         }
       }
     }
   
   
    public static void main(String[] args) 
    {
        // GUIS should be constructed on the EDT.
        JFrame tt = new login();
        
        
    }
 
 }   