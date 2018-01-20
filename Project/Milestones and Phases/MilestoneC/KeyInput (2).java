import java.io.*;

//Filename: KeyInput.java
//Author: Joe Lin and Sailesh Nankani
//Date: May 11, 2016
//Description: KeyInput requires the user to enter the relevant information and returns a string suitable for insertion into an
//existing external file.

class KeyInput
/** KeyInput requires the user to enter the relevant information and returns a string suitable for insertion into an
* existing external file.
* @author Joe Lin and Sailesh Nankani*/

{
   SearchInput s2 = new SearchInput();
   
   static final int MAX = 20;
   static String info[][]= new String[MAX][6];
   static String txt, input, searchMovie;
   static String items[] = new String[6];
   // static String info3[][] = new String[MAX][5];
   static String newRec2;
   
   
   

   /* The entries method requires user to enter the relevant information and returns a string suitable for insertion into an existing external file. */
   public static String entries(String fileName, String fileName2, String str, String info3[][], int item)
   {
      Search5 d = new Search5();
      String text = new String();
      String abc;
      //System.out.println("XXXXX");
      //System.out.println(info3[1][2]);
      //System.out.println("XXXXX");
      
      DataInput keyboard = new DataInputStream(System.in);
   try 
   {
      //System.out.println("Enter Last Name, First Name");
      //input = keyboard.readLine();
      String lastName = str.substring(0, str.indexOf(","));
      String firstName = str.substring(str.indexOf(" ") +1);
      txt = lastName+" "+firstName; 
      int index = 1;   // Get next time; item index 1 to 5
      
         
         
         /**switch(index)
         {
            case 1:  System.out.println("Enter the movie you want to rent.");
               break;
         }  //end switch
         input = keyboard.readLine();
         */
        
         //mainVideo mv = new mainVideo(fileName2, info3, item, txt);
         
         
         /**newRec2 = d.searching(fileName2, info3, item, input);
         System.out.println(newRec2);
         txt += newRec2;
         System.out.println("\nNew record complete.");
         */

   
   
   }  catch(Exception e) {}
   System.out.println(txt);
   return txt;
   

   
   } // end entries
   
}  //end keyInput