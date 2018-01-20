import java.io.*;

//Filename: Joiner.java
//Author: Joe Lin and Sailesh Nankani
//Date: May 11, 2016
//Description: Joiner requires the user to enter the relevant information and returns a string suitable for insertion into an
//existing external file.

class Joiner
/** Joiner requires the user to enter the relevant information and returns a string suitable for insertion into an
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
   
   
   

   /* The joiner method requires user to enter the relevant information and returns a string suitable for insertion into an existing external file. */
   public static String joiner(String mov, String mov2)
   {
      Search5 d = new Search5();
      String text = new String();
      String abc;
      //System.out.println("XXXXX");
      //System.out.println(info3[1][2]);
      //System.out.println("XXXXX");
      
      DataInput keyboard = new DataInputStream(System.in);
   System.out.println(txt);
   return txt;
   

   
   } // end joiner
   
}  //end keyInput