//Filename: Search5.java
//Author: Sailesh Nankani and Joe Lin
//Date: May 11, 2016
//Description: Search5 finds item the item exists in the records. It searches for the data given in a two-dimensional array, the item and value to be searched.


import java.io.*;

/** Search5 finds item the item exists in the records. It searches for the data given in a two-dimensional array, the item and value to be searched.
* @author Joe Lin and Sailesh Nankani*/

class Search5
{
   static String temp[] = new String[5];
   static String text="";
   /** The searching method looks for record specified by user as input in the external file.
   * @param fileName    The name of the external file which contains the record.
   * @param data        The two-dimensional array that stores the records.
   * @param item        Specifies the list to be sorted by names, ids, homeforms or periods.
   * @param input       The input is the String entered by the user     */  
   static String searching(String fileName2,String info3[][], int item, String input)
   {
      //item = part to be found
      boolean found = false;
      for (int i = 0; i< info3.length; i++) 
      {
         //search for records
         
         
         if (info3[i][item].equals(input))
         {
            System.out.println(info3[i][item]);
            found = true;
            System.out.println("SAILESH");
            for (int k = 0; k < 6; k++)
            {
               text += "#" + info3[i][k];               
            }
            System.out.println();
            System.out.println(text);
            
            
            
         } //end if
      } //end loop
      
      if (!found)
      {
         System.out.println("No record found!");
      }
      
      return text;
    
   } 
   
   
   
   
} //end Search5