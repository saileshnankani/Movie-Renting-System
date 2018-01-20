//Filename: MovieRentalMain.java
//Author: Joe Lin, Sailesh Nankani and Annie Sun
//Date: June 15, 2016
//Description: MovieRentalMain initiates the main renting program. It gets input from both old and new users 
//and brings up the appropriate window for each one. It then allows both kinds of users to rent new Movies and it allows
//the return users to return movie. 


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

/** MovieRentalMain initiates the main renting program. It gets input from both old and new users 
* and brings up the appropriate window for each one. It then allows both kinds of users to rent new Movies and it allows
* the return users to return movie. 
* @author Annie Sun, Joe Lin and Sailesh Nankani*/


class MovieRentalMain extends JFrame {

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
    static String str4;
    Sorter s = new Sorter();
    Search2 f = new Search2();
    Search3 g = new Search3();
    tsil mg = new tsil();
    boolean test;
    KeyInput ki = new KeyInput();
    static String fileName2;           // fileName for the external file, movies.txt.
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
    String info2[][] = new String[info.length][6];
    String str2 ="";

   
    static String txt, input, searchMovie;
      
    /** Constructor that prepares the display and initiates the Video Rental System. */
    public MovieRentalMain() {
    
        //constructor to prepare window size and menubar
        setSize(700, 560);  
        
        //set up the menubar
        JMenuBar mb = new JMenuBar();
        setJMenuBar(mb);
      
        //set up the submenus
        JMenu Help = new JMenu("Sort");
        JMenu Help2 = new JMenu("Help");
        mb.add(Help);
        mb.add(Help2);
        JMenuItem helpSub15 = new JMenuItem("By Movie Name");
        JMenuItem helpSub12 = new JMenuItem("By Year");
        JMenuItem helpSub13 = new JMenuItem("By Ratings");
        JMenuItem helpSub14 = new JMenuItem("By Runtime");
        
        JMenuItem helpSub21 = new JMenuItem("About");
        
        //add the submenu to menu
        Help.add(helpSub15);
        Help.add(helpSub12);
        Help.add(helpSub13);
        Help.add(helpSub14);
        Help2.add(helpSub21); 
      
      

        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setTitle("Login Page");
        setResizable(false);
        textField = new JTextField(15);
        lab = new JLabel("New User (e.g. John, Smith)");
        lab.setForeground(Color.WHITE);
        lab.setFont(new Font("Serif", Font.BOLD, 25));
        lab2 = new JLabel("Return User (e.g. John Smith)");
        lab2.setForeground(Color.WHITE);
        lab2.setFont(new Font("Serif", Font.BOLD, 25));
        
        //formatting the input text
        textField.setFont(textField.getFont().deriveFont(25f));
        
        //set up textfield
        textField2 = new JTextField(15);
        textField2.setFont(textField2.getFont().deriveFont(25f));
        
        //set up the panel and the layout
        panel = new JPanel(new GridBagLayout());
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


        rows =rd.readFile(fileName,10);
        info =re.getRecords(rows);
        
        
        rows2 =rd2.readFile(fileName2, 8);
        info3= re.getRecords(rows2);
        
        add(panel);
        
                  
         helpSub15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            
            
            info2 = s.sort(info3, 1);
            SortMovies mv = new SortMovies(info2, item);
            mg.tsil(info);
            
              // Clear two values.
            }
         });
         
         helpSub12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            
            info2 = s.sort(info3, 2);
            SortMovies mv = new SortMovies(info2, item);
            mg.tsil(info);
              // Clear two values.
            }
         });
        
        helpSub13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            
            info2 = s.sort(info3, 3);
            SortMovies mv = new SortMovies(info2, item);
            mg.tsil(info);
              // Clear two values.
            }
         });
        
        
        helpSub14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            
            info2 = s.sort(info3, 4);
            SortMovies mv = new SortMovies(info2, item);
            mg.tsil(info);
              // Clear two values.
            }
         });
      
         helpSub21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            String a = "Video Rental is a product that allows you to manually sign out movies that you would like to watch.";
            String b = "In total there are 8 movies to choose from, follow the steps below to get started! (Don’t forget to return them!)";
            String c = "Step 1:"+"\n"+"If you are a new user, enter your full name and press “Enter” (Eg. John. Smith)"+"\n"+"OR";
            String d = "If you are a return user, enter your full name and press “Enter” (Eg. John Smith)";
            String e = "Step 2:" + "\n"+"If you are a new user, then enter the movie name that you would like to rent, double check the spelling and capitalization. (Eg. Deadpool)";
            String f = "If you are a return user, choose whether you want to rent movies or return movies.";
            String g = "Option 1:"+"\n"+"Rent Movies: Enter the movie name and press “Enter” until you see “Record deleted”";
            String h = "Option 2:"+"\n"+"Return Movies: Enter the movie name that you would like to rent and press “Enter”, double check the spelling and capitalization (Eg. Deadpool)";
            String i = "Step 3:"+"\n"+"New User and Return User: ";
            String j = "A detailed description of the movie you have chosen will pop up; click “Rent” on the top if you would like to rent the movie.";
            String k = "(Receipt will be printed below)";
            String l = "Ps: you could always rent out multiple movies, just need to go through the process again!";
            
            String abc = String.format(a + "\n" + b+"\n\n"+c+"\n"+d+"\n\n"+e+"\n"+f+"\n"+g+"\n"+h+"\n\n"+i+"\n"+j+"\n"+k+"\n\n"+l, actionEvent.getActionCommand());
            JOptionPane.showMessageDialog(null, abc);
            
            }
         });

        
        Handler H1 = new Handler();
        textField.addActionListener(H1);
        textField2.addActionListener(H1);
        
        
                
        setVisible(true);   
               
    } //end constructor 
   

    
    
    private class Handler implements ActionListener 
    {
      /** Method to read and perform search when user enters the name.  */
      public void actionPerformed(ActionEvent event)
      {
         String string = "";
         

            
         if (event.getSource() == textField)
         {
            
            string = String.format("Welcome", event.getActionCommand());
            String str = textField.getText();
            
            rows =rd.readFile(fileName,11);
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
               int exam[] = new int[2];
               
               newRec= ki.entries(fileName, fileName2, str, info3, 1);
               choose(str4);

            }
            
            else if (!found)
            {
               string = String.format("Sorry, no record found.", event.getActionCommand());

               JOptionPane.showMessageDialog(null, string);
            }
            
            
            
         }      

               
            
      }
    }
    
    /** Constructor that prepares the display for choice screen after the return user logins in.
    * @param str9     The String of the name of the customer. 
    * @return newRec  The String suitable for insertion into the external file, customers.txt. */
    public String choose(String str9) {
        
        panel.removeAll();
        button1 = new JButton("Rent movie");
        button2 = new JButton("Return movie");
        String str10;
 
        panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        GridBagConstraints d = new GridBagConstraints();
        c.insets = new Insets(40,40,15,15);
        c.gridx=0;
        c.gridy=0;
        panel.setBackground(Color.BLUE);
        panel.add(button1,c);

        c.gridx=0;
        c.gridy=1;
        panel.add(button2,c);
        
        
        add(panel);
        
        newRec = str9;
        Handler4 H4 = new Handler4();
        button1.addActionListener(H4);
        button2.addActionListener(H4);

        
        setVisible(true); 
        
        return newRec;
    }
    
    /** Constructor that prepares the rent interface, displaying all the available movie titles and the search bar.
    * @param str     The String of the name of the customer. 
    * @return newRec The String suitable for insertion into the external file, customers.txt. */
    public String pictures4(String str)
    {
    
            panel.removeAll();
            textField = new JTextField(20);
            textField.setFont(textField.getFont().deriveFont(25f));
            panel = new JPanel(new GridBagLayout());
            panel2 = new JPanel();
            GridBagConstraints c = new GridBagConstraints();
            panel.setBackground(Color.BLUE);
            panel2.setBackground(Color.BLUE);
            c.gridx=0;
            c.gridy=5;
            panel.add(textField, c);
            c.gridx=0;
            c.gridy=5;
            panel2.setBackground(Color.BLUE);
         
            ImageLabel label = new ImageLabel(new ImageIcon("Images/batman2.jpg"));
            ImageLabel label2 = new ImageLabel(new ImageIcon("Images/Capture.jpg"));
            ImageLabel label3 = new ImageLabel(new ImageIcon("Images/shrek.jpg"));
            ImageLabel label4 = new ImageLabel(new ImageIcon("Images/Capture.jpg"));
            ImageLabel label5 = new ImageLabel(new ImageIcon("Images/deadpool.jpg"));
            ImageLabel label6 = new ImageLabel(new ImageIcon("Images/Capture.jpg"));
            ImageLabel label7 = new ImageLabel(new ImageIcon("Images/frozen.jpg"));
            
            label4.setLocation(555, 80);
            ImageLabel label9 = new ImageLabel(new ImageIcon("Images/elf2.jpg"));
            ImageLabel label10 = new ImageLabel(new ImageIcon("Images/Capture.jpg"));
            label5.setLocation(40, 280);
            ImageLabel label11 = new ImageLabel(new ImageIcon("Images/bounce.jpg"));
            ImageLabel label12 = new ImageLabel(new ImageIcon("Images/Capture.jpg"));
            label6.setLocation(212, 280);
            ImageLabel label13 = new ImageLabel(new ImageIcon("Images/ted.jpg"));
            ImageLabel label14 = new ImageLabel(new ImageIcon("Images/Capture.jpg"));
            label7.setLocation(383, 280);
            ImageLabel label15 = new ImageLabel(new ImageIcon("Images/titanic.jpg"));
            ImageLabel label16 = new ImageLabel(new ImageIcon("Images/Capture.jpg"));
            ImageLabel label17 = new ImageLabel(new ImageIcon("Images/Capture2.jpg"));
            ImageLabel label18 = new ImageLabel(new ImageIcon("Images/Capture2.jpg"));
            ImageLabel label19 = new ImageLabel(new ImageIcon("Images/Capture2.jpg"));
            ImageLabel label20 = new ImageLabel(new ImageIcon("Images/Capture2.jpg"));
            
            
        
        
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
              setTitle("Movies");
              
              for (int a =0; a<info3.length; a++)
               {
                  for (int b=0; b<info4[a].length; b++)
                  {
                     info4[a][b] = info3[a][b];
                  }
               }
              
              
              add(panel2);
              add(panel, BorderLayout.SOUTH);
              setVisible(true);
              
              
              
              Handler6 H2 = new Handler6();
              textField.addActionListener(H2);
              
              return newRec;
    
    }  
   
      private class Handler6 implements ActionListener 
    {
      

      /** Method that reads the user input, initializes the String to be inserted and redirects to renting interface. */
      public void actionPerformed(ActionEvent event)
      {
         String string = "";
            
         if (event.getSource() == textField)
         {

            
              
            str2 = textField.getText();
            newRec2 = d.searching(fileName2, info4, item, str2);
            newRec += newRec2;
            System.out.println(newRec);
  
                      
            
            
            Movies mv = new Movies(str2, newRec, str, info4, info);
            

         }
       }
     }

    
    private class Handler4 implements ActionListener 
    {
    
      /** Method that redirects to the either the rent interface or the return interface depending on the user interaction.*/
      public void actionPerformed(ActionEvent event)
      {
         String string = "";
         

            
            
            
         if (event.getSource() == button1)
         {

            pictures3(newRec);

         }    
         
         if (event.getSource() == button2)
         {

            pictures2(info);
            
            
         }   
        
            
      }
      
      /** Constructor that prepares the display for return interface with the search bar to search and delete the existing record.
      *  @param info       The array containing records of the customer in the external file customers.txt.*/
      public void pictures2(String info[][])
    {
      
      panel.removeAll();
      panel = new JPanel(new GridBagLayout());
      textField = new JTextField(20);
      textField.setFont(textField.getFont().deriveFont(25f));
      lab = new JLabel("Enter the name of the movie you want to return.");
      lab.setForeground(Color.WHITE);
      lab.setFont(new Font("Serif", Font.BOLD, 25));
      GridBagConstraints c = new GridBagConstraints();
      panel.setBackground(Color.BLUE);
      c.gridx=0;
      c.gridy=-3;
      panel.add(lab,c);
      c.gridx=0;
      c.gridy=8;
      panel.add(textField, c);
      
 
      add(panel);
      
      
      
      setVisible(true);
      
      
      Handler3 H1 = new Handler3();
      textField.addActionListener(H1);

    }
    
    /** Constructor that prepares the rent interface, displaying all the available movie titles and the search bar.
    * @param str        The String of the name of the customer. 
    * @return newRec    The String suitable for insertion into the external file, customers.txt.*/    
    public String pictures3(String str)
    {
    
             panel.removeAll();
            textField = new JTextField(20);
            textField.setFont(textField.getFont().deriveFont(25f));
            panel = new JPanel(new GridBagLayout());
            panel2 = new JPanel();
            GridBagConstraints c = new GridBagConstraints();
            panel.setBackground(Color.BLUE);
            panel2.setBackground(Color.BLUE);
            c.gridx=0;
            c.gridy=5;
            panel.add(textField, c);
            c.gridx=0;
            c.gridy=5;
            panel2.setBackground(Color.BLUE);
         
            ImageLabel label = new ImageLabel(new ImageIcon("Images/batman2.jpg"));
            ImageLabel label2 = new ImageLabel(new ImageIcon("Images/Capture.jpg"));
            ImageLabel label3 = new ImageLabel(new ImageIcon("Images/shrek.jpg"));
            ImageLabel label4 = new ImageLabel(new ImageIcon("Images/Capture.jpg"));
            ImageLabel label5 = new ImageLabel(new ImageIcon("Images/deadpool.jpg"));
            ImageLabel label6 = new ImageLabel(new ImageIcon("Images/Capture.jpg"));
            ImageLabel label7 = new ImageLabel(new ImageIcon("Images/frozen.jpg"));
            
            label4.setLocation(555, 80);
            ImageLabel label9 = new ImageLabel(new ImageIcon("Images/elf2.jpg"));
            ImageLabel label10 = new ImageLabel(new ImageIcon("Images/Capture.jpg"));
            label5.setLocation(40, 280);
            ImageLabel label11 = new ImageLabel(new ImageIcon("Images/bounce.jpg"));
            ImageLabel label12 = new ImageLabel(new ImageIcon("Images/Capture.jpg"));
            label6.setLocation(212, 280);
            ImageLabel label13 = new ImageLabel(new ImageIcon("Images/ted.jpg"));
            ImageLabel label14 = new ImageLabel(new ImageIcon("Images/Capture.jpg"));
            label7.setLocation(383, 280);
            ImageLabel label15 = new ImageLabel(new ImageIcon("Images/titanic.jpg"));
            ImageLabel label16 = new ImageLabel(new ImageIcon("Images/Capture.jpg"));
            ImageLabel label17 = new ImageLabel(new ImageIcon("Images/Capture2.jpg"));
            ImageLabel label18 = new ImageLabel(new ImageIcon("Images/Capture2.jpg"));
            ImageLabel label19 = new ImageLabel(new ImageIcon("Images/Capture2.jpg"));
            ImageLabel label20 = new ImageLabel(new ImageIcon("Images/Capture2.jpg"));
            
            
        
        
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
              setTitle("Movies");
              
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
              
              
              
              Handler5 H2 = new Handler5();
              textField.addActionListener(H2);
              
              return newRec;
    
    }  
    
    private class Handler3 implements ActionListener 
    {
      
      
      /** Searches the user input in the external file, customers.txt. */
      public void actionPerformed(ActionEvent event)
      {
         String string = "";
         String string2 = "";
         
            
         if (event.getSource() == textField)
         {
            
            System.out.println(newRec);
            String str2 = textField.getText();
            System.out.println(str2);
            int item = 0;
            boolean z;
            fileName = "customers.txt";

            z=f.searching(fileName, info, item, newRec, str2);
            
            if (!z)
            {
               string2 = String.format("Return successful!", event.getActionCommand());
                
               JOptionPane.showMessageDialog(null, string2);
               dispose();
            
            }

            
            if (z)
            {
               string = String.format("Sorry, no record found.", event.getActionCommand());

               JOptionPane.showMessageDialog(null, string);
            
            }

            

         }
       }
     }

    private class Handler5 implements ActionListener 
    {
      

      /* Method that reads the user input and redirects to the rent interface.*/
      public void actionPerformed(ActionEvent event)
      {
         String string = "";
         String newRec2="";
            
         if (event.getSource() == textField)
         {
            
            String str2 = textField.getText();
            newRec2="";
            newRec2 = d.searching(fileName2, info4, item, str2);
            String ab;
            ab = newRec + newRec2;

            
            int item = 1;
            boolean z;
            fileName = "movies.txt";
            

            z=g.searching(fileName, info4, item, str2, ab);
            
            if (z)
            {
               
               Movies mv = new Movies(str2, ab, str, info4, info);
               
            }
            
            if (!z)
            {
               string = String.format("Sorry, no record found.", event.getActionCommand());

               JOptionPane.showMessageDialog(null, string);
            
            }
            
         }
       }
     }

    
    }


    /** Constructor that prepares the rent interface, displaying all the available movie titles and the search bar.
    * @param str     The String of the name of the customer. 
    * @return newRec The String suitable for insertion into the external file, customers.txt.*/
    public String pictures(String str)
    {
    
             panel.removeAll();
            textField = new JTextField(20);
            textField.setFont(textField.getFont().deriveFont(25f));
            panel = new JPanel(new GridBagLayout());
            panel2 = new JPanel();
            GridBagConstraints c = new GridBagConstraints();
            panel.setBackground(Color.BLUE);
            panel2.setBackground(Color.BLUE);
            c.gridx=0;
            c.gridy=5;
            panel.add(textField, c);
            c.gridx=0;
            c.gridy=5;
            panel2.setBackground(Color.BLUE);
         
            ImageLabel label = new ImageLabel(new ImageIcon("Images/batman2.jpg"));
            ImageLabel label2 = new ImageLabel(new ImageIcon("Images/Capture.jpg"));
            ImageLabel label3 = new ImageLabel(new ImageIcon("Images/shrek.jpg"));
            ImageLabel label4 = new ImageLabel(new ImageIcon("Images/Capture.jpg"));
            ImageLabel label5 = new ImageLabel(new ImageIcon("Images/deadpool.jpg"));
            ImageLabel label6 = new ImageLabel(new ImageIcon("Images/Capture.jpg"));
            ImageLabel label7 = new ImageLabel(new ImageIcon("Images/frozen.jpg"));
            
            label4.setLocation(555, 80);
            ImageLabel label9 = new ImageLabel(new ImageIcon("Images/elf2.jpg"));
            ImageLabel label10 = new ImageLabel(new ImageIcon("Images/Capture.jpg"));
            label5.setLocation(40, 280);
            ImageLabel label11 = new ImageLabel(new ImageIcon("Images/bounce.jpg"));
            ImageLabel label12 = new ImageLabel(new ImageIcon("Images/Capture.jpg"));
            label6.setLocation(212, 280);
            ImageLabel label13 = new ImageLabel(new ImageIcon("Images/ted.jpg"));
            ImageLabel label14 = new ImageLabel(new ImageIcon("Images/Capture.jpg"));
            label7.setLocation(383, 280);
            ImageLabel label15 = new ImageLabel(new ImageIcon("Images/titanic.jpg"));
            ImageLabel label16 = new ImageLabel(new ImageIcon("Images/Capture.jpg"));
            ImageLabel label17 = new ImageLabel(new ImageIcon("Images/Capture2.jpg"));
            ImageLabel label18 = new ImageLabel(new ImageIcon("Images/Capture2.jpg"));
            ImageLabel label19 = new ImageLabel(new ImageIcon("Images/Capture2.jpg"));
            ImageLabel label20 = new ImageLabel(new ImageIcon("Images/Capture2.jpg"));
            
            
        
        
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
              setTitle("Movies");
              
              for (int a =0; a<info3.length; a++)
               {
                  for (int b=0; b<info4[a].length; b++)
                  {
                     info4[a][b] = info3[a][b];
                  }
               }
              
 
              
              add(panel2);
              add(panel, BorderLayout.SOUTH);
              setVisible(true);
              


              
              
              Handler2 H2 = new Handler2();
              textField.addActionListener(H2);
              
              
              return newRec;
    
    }  
    
    
    private class Handler2 implements ActionListener 
    {
      

      /* Method that reads the user input and redirects to the rent interface.*/
      public void actionPerformed(ActionEvent event)
      {
         String string = "";
         String newRec2="";
            
         if (event.getSource() == textField)
         {
            
            String str2 = textField.getText();
            newRec2="";
            newRec2 = d.searching(fileName2, info4, item, str2);
            String ab;
            ab = newRec + newRec2;

            
            int item = 1;
            boolean z;
            fileName = "movies.txt";
            

            z=g.searching(fileName, info4, item, str2, ab);
            
            if (z)
            {
               
               Movies mv = new Movies(str2, ab, str, info4, info);
               
            }
            
            if (!z)
            {
               string = String.format("Sorry, no record found.", event.getActionCommand());

               JOptionPane.showMessageDialog(null, string);
            
            }
            
         }
       }
     }

    
          
     

    
    private class tsil
   {
      /** Method that prints out the records in customers.txt.
      * @param info     The 2 dimensional array containing the records of customers from the external file. */
      public void tsil(String info[][])
        {
         for (int a =0; a<(info.length); a++)
            {
               for (int b =0; b<6; b++)
               {
                  System.out.println(info[a][b]);
               }
            System.out.println();
            }   
        
        }  
    } 
  
       
    /** Instantiates MovieRentalMain class. 
    * @param args */
    public static void main(String[] args) 
    {
        JFrame tt = new MovieRentalMain();
        
        
    }
 
 }   