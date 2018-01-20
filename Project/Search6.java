//Filename: Search6.java
//Author: Joe Lin, Sailesh Nankani and Annie Sun
//Date: June 15, 2016
//Description: Search6 searches the items in customers.txt and returns a true if the item is found or returns a false if not found.


import java.io.*;

/** Search6 searches the items in customers.txt and returns a true if the item is found or returns a false if not found.
* @author Annie Sun, Joe Lin and Sailesh Nankani*/

class Search6
{
   static String temp[] = new String[5];
   static String text="";
   static String text2="";
   /** The searching method looks for record specified by user as str in the external file.
   * @param fileName2    The name of the external file which contains the record.
   * @param info4        The two-dimensional array that stores the records.
   * @param item         Specifies the list to be sorted by names, ids, homeforms or periods.
   * @param str          The str is the String entered by the user     
   * @return found       The boolean that states the whether the str is found(true) or not found (false)      */  
   static boolean searching(String fileName2,String info4[][], int item, String str)
   {
      //item = part to be found
      boolean found = false;

      
      for (int i = 0; i< 10; i++) 
      {
         //search for records
         
         if (info4[i][0].equals(str))
         {
            found = true;
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