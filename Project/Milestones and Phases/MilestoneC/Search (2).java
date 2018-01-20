//Filename: Search.java
//Author: Sailesh Nankani and Joe Lin
//Date: May 11, 2016
//Description: Search finds item the item exists in the records. It searches for the data given in a two-dimensional array, the item and value to be searched.


import java.io.*;

/** Search finds item the item exists in the records. It searches for the data given in a two-dimensional array, the item and value to be searched.
* @author Joe Lin and Sailesh Nankani*/

class Search
{
   static String text;
   /** The searching method looks for record specified by user as input in the external file.
   * @param fileName    The name of the external file which contains the record.
   * @param data        The two-dimensional array that stores the records.
   * @param item        Specifies the list to be sorted by names, ids, homeforms or periods.
   * @param input       The input is the String entered by the user     */  
   static String searching(String fileName,String data[][], int item, String input)
   {
      //item = part to be found
      boolean found = false;
      
      for (int i = 0; i< data.length; i++) 
      {
         //search for records
         if (data[i][item].equals(input))
         {
            found = true;
            for (int k = 0; k < 6; k++)
            {
               System.out.print(data[i][k] + "\t\t"); //output entire record
               text += "#"+data[i][k];
               
            }
            System.out.println();
            System.out.println(text);
         } //end if
      } //end loop
      
      
      if (!found)
      {
         System.out.println("No record found!");
      }  return text; 
   }  
   //end searching
} //end Search