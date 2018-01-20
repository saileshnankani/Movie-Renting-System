//Filename: SearchInput2.java
//Author: Joe Lin and Sailesh Nankani
//Date: May 11, 2016
//Description: SearchInput2 get the keyboard input of the value of searched and delted. It calls the searching method from
//the Search2.class

import java.io.*;

/** SearchInput2 get the keyboard input of the value of searched and delted. It calls the searching method from
* the Search2.class
* @author Joe Lin and Sailesh Nankani*/

class SearchInput2
{  

   //Prepare keyboard to receive data
   /** The keyInput method searches the keyboard input in the records by calling the searching method and deletes it.
   * @param fileName    The name of the external file which contains the record.
   * @param data        The one-dimensional array that stores the records.
   * @param item        Specifies the list to be sorted by names, ids, homeforms or periods.    */  
   void keyInput(String fileName, String data[][], int item)
   {
      DataInput d = new DataInputStream(System.in);
      
      String input;
      Search2 s = new Search2();
      try
      {
         while((input = d.readLine())!= null)
         {
            System.out.print("Searching...\n");
            s.searching(fileName, data, item, input);
         }
        
      } catch (IOException ignored) {}
   
   
   }  // end keyInput


} // end SearchInput