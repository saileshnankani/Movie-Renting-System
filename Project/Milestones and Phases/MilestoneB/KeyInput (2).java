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
   static String info3[][] = new String[MAX][5];
   static String newRec2;

   /* The entries method requires user to enter the relevant information and returns a string suitable for insertion into an existing external file. */
   public static String entries(String fileName, String fileName2, String info3[][], int item)
   {
      Search5 d = new Search5();
      String text = new String();
      
      DataInput keyboard = new DataInputStream(System.in);
   try 
   {
      System.out.println("Enter Last Name, First Name");
      input = keyboard.readLine();
      String lastName = input.substring(0, input.indexOf(","));
      String firstName = input.substring(input.indexOf(" ") +1);
      txt = lastName+" "+firstName; 
      int index = 1;   // Get next time; item index 1 to 5
      
      
      while ((input != null) && index < 6)
      {  
         switch(index)
         {
            case 1:  System.out.println("Enter the movie you want to rent.");
               break;
         }  //end switch
         input = keyboard.readLine();
         newRec2 = d.searching(fileName2, info3, item, input);
         txt += "#" + newRec2;
         //items[index]=input;
         // index++;
      }  // end while
      
   

      

   
   System.out.println("\nNew record complete.");
   }  catch(Exception e) {}
   System.out.println(txt);
   System.out.println();
   return txt;
   

   
   } // end entries
   
}  //end keyInput