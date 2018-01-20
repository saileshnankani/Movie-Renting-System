//Filename: Records.java
//Author: Joe Lin, Sailesh Nankani and Annie Sun
//Date: June 15, 2016
//Description: Records separates each line of record into 6 component parts. Each part is stored in a 2-D array.

import java.util.StringTokenizer;


/** Records separates each line of record into 6 component parts. Each part is stored in a 2-D array.
* @author Annie Sun, Joe Lin and Sailesh Nankani*/

class Records 

{ // Separate a line of record into 6 component parts
   /** Separate a line of record into 6 component parts
   * @param data        The one-dimensional array that stores the records.
   * @return records    The 2-D array containing the records from the external file. */
   public String[][] getRecords (String data[])
   {
      int n =data.length;
      String records[][] = new String[n][6]; //Store records in 2-D array
      for (int p=0; p<n; p++) // Initialize all records
         for (int q =0; q<6; q++)
            records[p][q]="";
      for (int line =0; line<n; line++)
      {
         if(data[line].equals("")) break;
         StringTokenizer st = new StringTokenizer(data[line], "#");
         int i =0;
         while (st.hasMoreTokens() && i<6)
         {
            records[line][i]=st.nextToken(); //Store each item of the record
            System.out.print(records[line][i] + "\t\t");
            i++;
              
         }
         System.out.println();

      }//end for
      return records; // Return the 2-D record
   } //end getRecords
} //Records