//Filename: Search2.java
//Author: Joe Lin and Sailesh Nankani
//Date: May 11, 2016
//Description: Search2 looks for the record to be deleted and then updates all remaining records.

import java.io.*;

/** Search2 looks for the record to be deleted and then updates all remaining records.
* @author Joe Lin and Sailesh Nankani*/

class Search2     // returns array after deleting

{
   /** The searching method looks for records to be deleted and calls on updateFile method to update the records.
   * @param fileName    The name of the external file which contains the record.
   * @param data        The two-dimensional array that stores the records.
   * @param item        Specifies the list to be sorted by names, ids, homeforms or periods.
   * @param input       The input is the String entered by the user     */  
   void searching (String fileName, String data[][], int item, String input)
   {  
      // item:o = name etc
      boolean found = false;
      System.out.print(data.length);
      for (int i =0; i<data.length; i++)
      {
         // search for records
 
         if (data[i][item].equals(input) && data[i][item] != "")
         {  
            found =true;
            System.out.println("Record to delete:");
            for (int k=0; k<6; k++)
            {
               System.out.print(data[i][k] + "\t\t"); // Output the entire record
               data[i][k] = ""; // Erase the record items
            }
            System.out.println();   
         }// end if
                
         
      }//end loop
      if (!found)
      {
         System.out.println(" No recordfound!");
      }
      UpdateRecords ur = new UpdateRecords();
      ur.updateFile(fileName, data);
   } //end searching
         
}  //end Search2