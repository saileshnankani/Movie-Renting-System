//Filename: LTS.java
//Author: Joe Lin and Sailesh Nankani
//Date: May 11, 2016
//Description: The Late Tracking System (LTS) tracks students' punctuality. It can add new record, delete existing ones and print late slips. 
//It can also sort,find and list records.


import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.*;

/** The Late Tracking System (LTS) tracks students' punctuality. It can add new record, delete existing ones to the list 
* and print late slips. It can also sort, find and list records.
* @author Joe Lin and Sailesh Nankani*/

public class LTS extends Frame
{
   String nameArray [] = new String[10];
   static String fileName; 
   static String fileName2;
   static String newRec;
   static String input;
   final int MAX = 20;
   String rows[] = new String[MAX];
   String rows2[] = new String[MAX];
   String info[][]= new String[MAX][6];
   String info2[][] = new String[info.length][6];
   String info3[][] = new String[MAX][5];
   ReadData rd=new ReadData();
   ReadData2 rd2 = new ReadData2();
   Records re = new Records();
   Sorter s = new Sorter();
   Search5 d = new Search5();
   SearchInput si = new SearchInput();
   SearchInput2 si2 = new SearchInput2();
   NewRecord nr = new NewRecord();
   KeyInput ki = new KeyInput();
   Output ou = new Output();
   String data[][] = new String[MAX][6];
   

   
   /** Constructor that prepares the display and initiates the Late Tracking System. */
   public LTS()
   {
      //constructpr to prepare window size and menubar
      super("My Window");
      resize(700, 500); //window size
      makeMenus();
      show();
      CloseMe cm = new CloseMe();
      addWindowListener(cm);
   } //end constructor 
   
   /** Method to instantiate menubar.  */
   private void makeMenus()
   {
      //instantiate menubar
      MenuBar mb = new MenuBar();
      Menu m1 = new Menu ("Data"); //create data     
      m1.add(new MenuItem("Load")); //create load
      m1.add(new MenuItem("List")); //create  list
      m1.add(new MenuItem("New")); //create new
      Menu m5 = new Menu ("Return"); //create delete
      m5.add(new MenuItem("By Name")); // create delete names
      m5.add(new MenuItem("By ID")); // create delete ids
      m5.add(new MenuItem("By homeform")); // create delete homeforms
      m5.add(new MenuItem("By Period")); // create delete period
      m1.add(m5);
      m1.add(new MenuItem("Print")); // create print 
      m1.add(new MenuItem("Quit/Q")); //"Quit/Q" to get shortcut
      
      
      
      Menu m2 = new Menu ("Sort"); //create sort
      m2.add(new MenuItem("Names")); //create names
      m2.add(new MenuItem("IDs")); //create IDs
      m2.add(new MenuItem("Homeforms")); //create homeforms
      m2.add(new MenuItem("Periods")); //create periods
      
      Menu m3 = new Menu ("Rent"); //create find
      m3.add(new MenuItem("By Names")); //create by names
      m3.add(new MenuItem("By Movie Name")); //create by IDs
      m3.add(new MenuItem("By Homeforms")); //create by Homeforms
      m3.add(new MenuItem("By periods")); //create by periods
      
      Menu m4 = new Menu ("Info"); //create info
      m4.add(new MenuItem("Help")); //create help
      
      mb.add(m1); //add data to menubar
      mb.add(m2); //add sort to menubar
      mb.add(m3); //add find to menubar
      mb.add(m4); //add info to menubar
      setMenuBar(mb); //show menubar
   } //end makeMenus
   
   /** Activates menuitem.  */
   public boolean action(Event evt, Object obj)
   {
      //activate menuItem
      if(evt.target instanceof MenuItem)
      {
         String label = (String) obj;
      
      
         if(label.equals("Quit/Q"))
      
            System.exit(0); //quit window
      
      
         else if(label.equals("Load")) //Activate load
         {      
            rows =rd.readFile(fileName,10);
            info =re.getRecords(rows);
            System.out.println();
            
            rows2 =rd2.readFile(fileName2, 10);
            info3= re.getRecords(rows2);
            System.out.println();
            
            

         }   
      
      
         else if(label.equals("List")) //Activate list
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
      
         else if(label.equals("New")) //Activate new
         {
            nr.addRecord(fileName, ki.entries(fileName, fileName2, info3, 1));
            

         }
      
         else if(label.equals("By Name")) //Activate delete names
         {
            si2.keyInput(fileName, info, 0);
          
         }
         
         else if(label.equals("By ID")) //Activate delete ids
         {
            si2.keyInput(fileName, info, 1);
          
         }
         else if(label.equals("By homeform")) //Activate delete homeforms
         {
            si2.keyInput(fileName, info, 2);
          
         }
         else if(label.equals("By Period")) //Activate delete periods
         {
            si2.keyInput(fileName, info, 5);
          
         }
                
      
         else if(label.equals("Print")) //Activate print
      
            ou.keyIn(info);
    
      
         else if(label.equals("Names")) //Activate names
      
            info2 = s.sort(info, 0);
      
      
         else if(label.equals("IDs")) //Activate ids
      
            info2 = s.sort(info, 1);
         
         else if(label.equals("Homeforms")) //Activate Homeforms
      
            info2 = s.sort(info, 2);
            
         else if(label.equals("Periods")) //Activate periods
      
            info2 = s.sort(info, 5);
            
         else if(label.equals("By Names")) //Activate by names
      
            si.keyInput(fileName, info, 0);
            
         else if(label.equals("By Movie Name")) //Activate by ids
      
            si.keyInput(fileName, info3, 1);
         
         else if(label.equals("By Homeforms")) //Activate by homeforms
      
            si.keyInput(fileName, info, 2);
            
            
         else if(label.equals("By periods")) //Activate by periods
      
            si.keyInput(fileName, info, 5);
         
         else if(label.equals("Help")) //Activate help
      
            {
               System.out.println("\n(1) Select Load from Data menu first.");
               System.out.println("\n(2) Select any menu item.");
               System.out.println("\n(3) Select List from Data to view results.\n");
            }
     
      }
      
      return true;  
   } //end of action 
   
   /** Instantiates LTS class. */
   public static void main(String srt[])
   {
      new LTS(); //instantiate LTS class
      fileName = "customers.txt"; 
      fileName2 = "movies.txt";
      
      
   } //end main
   
   /** Inserts a gif file into the default window. */
   public void paint(Graphics g)
   {
     
      Toolkit tk = Toolkit.getDefaultToolkit();
      Image img = tk.getImage("bgFinish.gif"); //add gif
      g.drawImage(img, 0, 20, this);
         
   } //end paint

   
} //end class

class CloseMe extends WindowAdapter
{
  public void windowClosing(WindowEvent e)
  {
    System.exit(0);
  }
}