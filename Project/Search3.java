//Filename: Search3.java
//Author: Joe Lin, Sailesh Nankani and Annie Sun
//Date: June 15, 2016
//Description: Search3 looks for record to be deleted and updates all remaining records. 

import java.io.*;

/** Search3 looks for record to be deleted and updates all remaining records.
* @author Annie Sun, Joe Lin and Sailesh Nankani*/

class Search3     // returns array after deleting

{
   /** The searching method looks for records to be deleted and calls on updateFile method to update the records.
   * @param fileName    The name of the external file which contains the record.
   * @param data        The two-dimensional array that stores the records.
   * @param item        Specifies the list to be sorted by names, ids, homeforms or periods.
   * @param input       The input is the String entered by the user 
   * @param input2      The input2 is the String entered by user for the movie.
   * @return z          The boolean indicates whether the input was successfully found (true) or not (false).     */  
   
   boolean searching (String fileName, String data[][], int item, String input, String input2)
   {  
      // item:o = name etc
      boolean found = false;
      boolean found2 = false;
      boolean z = false;
      String data2[][];
      
      for (int i =0; i<8; i++)
      {
         // search for records
         if (data[i][item].equals(input))
         {  
            System.out.println(data[i][item]);
            found =true;
            

         }// end if
                        
         
      }//end loop
      
      
      
      return found;
   } //end searching
         
}  //end Search3