//Filename: Search5.java
//Author: Joe Lin, Sailesh Nankani and Annie Sun
//Date: June 15, 2016
//Description:  Search5 finds the items if it exists in customers.txt and returns a String suitable for insertion into the 
//external file.

import java.io.*;

/** Search5 finds the items if it exists in customers.txt and returns a String suitable for insertion into the external file.
* @author Annie Sun, Joe Lin and Sailesh Nankani*/

class Search5
{
   static String temp[] = new String[5];
   static String text="";
   static String text2="";
   /** The searching method looks for record specified by user as str in the external file.
   * @param fileName2    The name of the external file which contains the record.
   * @param info4        The two-dimensional array that stores the records.
   * @param item         Specifies the list to be sorted by names, ids, homeforms or periods.
   * @param str          The str is the String entered by the user     
   * @return text        The String suitable for insertion into the external file  */  
   static String searching(String fileName2,String info4[][], int item, String str)
   {
      //item = part to be found
      boolean found = false;
      System.out.println(info4.length);
      for (int p=0; p<10; p++)
      {
         for (int l =0; l<5; l++)
         {
            System.out.print(info4[p][l]+"\t");
         }
         System.out.println("");
      
      }
      
      for (int i = 0; i< 8; i++) 
      {
         //search for records
         
         if (info4[i][1].equals(str))
         {
            text = "";
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
      return text;
      
    
   } 
   
   
   
   
} //end Search5