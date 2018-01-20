//Filename: KeyInput.java
//Author: Joe Lin, Sailesh Nankani and Annie Sun
//Date: June 15, 2016
//Description: KeyInput gets the relevant information and returns a string that will be suitable for insertion into an exisiting 
//external file after further modification.

import java.io.*;

/** KeyInput gets the relevant information and returns a string that will be suitable for insertion into an exisiting 
* external file after further modification.
* @author Annie Sun, Joe Lin and Sailesh Nankani*/

class KeyInput

{
   
   static final int MAX = 20;
   static String info[][]= new String[MAX][6];
   static String txt, input, searchMovie;
   static String items[] = new String[6];
   static String newRec2;
   
   /** Entries gets the relevant information and returns a string that will be suitable for insertion into an exisiting 
   * external file after further modification. 
   * @param fileName            Name of the file that contains the data2
   * @param fileName2           Name of the file that contains the records for movies. 
   * @param str                 The name of the customer. 
   * @param info3               The 2 dimensional array containing the records from movies.txt.
   * @param item                The integer to determine the category that needs to be searched up.     
   * @return txt                The String that is suitable for insertion into an existing external file. */
   
   public static String entries(String fileName, String fileName2, String str, String info3[][], int item)
   {
      Search5 d = new Search5();
      String text = new String();
      String abc;

      
      DataInput keyboard = new DataInputStream(System.in);
   try 
   {

      String lastName = str.substring(0, str.indexOf(","));
      String firstName = str.substring(str.indexOf(" ") +1);
      txt = lastName+" "+firstName; 
      int index = 1;   // Get next time; item index 1 to 5
      
         

   
   
   }  catch(Exception e) {}
   System.out.println(txt);
   return txt;
   

   
   } // end entries
   
}  //end keyInput