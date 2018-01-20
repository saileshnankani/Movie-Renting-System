//Filename: Search5Input.java
//Author: Sailesh Nankani and Joe Lin
//Date: May 11, 2016
//Description: Search5Input gets the keyboard input for the item to be searched.


import java.io.*;

/** Search5Input gets the keyboard input for the item to be searched.
* @author Joe Lin and Sailesh Nankani*/

class Search5Input
{
   // Prepare keyboard to receive data
   /** The keyInput gets the input to be searched from the user and calls the searching method from Search5.class.
   * @param fileName    The name of the external file which contains the record.
   * @param data        The two-dimensional array that stores the records.
   * @param item        Specifies the list to be sorted by names, ids, homeforms or periods.    */  
   public void keyInput(String fileName, String data[][], int item)
   {
      DataInput d = new DataInputStream(System.in);
      String input;
      Search5 s = new Search5();
      try
      {  
         while ((input = d.readLine())!= null)
         {
            System.out.print("Searching...\n");    
            s.searching(fileName, data, item, input);   
         }        
      
      } catch(IOException ignored) {}
   
   } // end keyinput
} // end searchinput
