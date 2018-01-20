//Filename: Search6.java
//Author: Sailesh Nankani and Joe Lin
//Date: May 11, 2016
//Description: Search6 finds item the item exists in the records. It searches for the data given in a two-dimensional array, the item and value to be searched.


import java.io.*;

/** Search6 finds item the item exists in the records. It searches for the data given in a two-dimensional array, the item and value to be searched.
* @author Joe Lin and Sailesh Nankani*/

class Search6
{
   static String temp[] = new String[5];
   static String text="";
   static String text2="";
   /** The searching method looks for record specified by user as str in the external file.
   * @param fileName    The name of the external file which contains the record.
   * @param data        The two-dimensional array that stores the records.
   * @param item        Specifies the list to be sorted by names, ids, homeforms or periods.
   * @param str       The str is the String entered by the user     */  
   static boolean searching(String fileName2,String info4[][], int item, String str)
   {
      //item = part to be found
      boolean found = false;

      
      for (int i = 0; i< 8; i++) 
      {
         //search for records
         
         if (info4[i][0].equals(str))
         {
            found = true;
            System.out.println("SAILESH");
            for (int k = 0; k < 5; k++)
            {
               text +=  "#"+info4[i][k];               
            }
            //System.out.println(text);

           
            
            
         } //end if
          
      } //end loop
      
      if (!found)
      {
         System.out.println("No record found!");
      }
      //System.out.println(text);
      return found;
    
   } 
   
   
   
   
} //end Search6