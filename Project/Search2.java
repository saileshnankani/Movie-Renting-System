//Filename: Search2.java
//Author: Joe Lin, Sailesh Nankani and Annie Sun
//Date: June 15, 2016
//Description: Search2 looks for record to be deleted and updates all remaining records. 

import java.io.*;

/** Search2 looks for record to be deleted and updates all remaining records.
* @author Annie Sun, Joe Lin and Sailesh Nankani*/

class Search2     // returns array after deleting

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
      
      for (int i =0; i<data.length; i++)
      {
         // search for records
         if (data[i][item].equals(input))
         {  
            found =true;
            
            for (int k=0; k<6; k++)
            {
               if (data[i][2].equals(input2))
               {
                  found2=true;
                  System.out.println("Record to delete:");
                  for (int p=0; p<6; p++)
                  {
                       
                       
                       System.out.print(data[i][k] + "\t\t"); // Output the entire record
                       data[i][k] = ""; // Erase the record items
                  }
               
               }
               
               
               
            }
            System.out.println();

         }// end if
      
                
         
      }//end loop
      
      
      if (!found)
      {
         z=true;
      }
      if (!found2)
      {
         z=true;
      }
      UpdateRecords ur = new UpdateRecords();
      ur.updateFile(fileName, data);
      
      return z;
   } //end searching
         
}  //end Search2