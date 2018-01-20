//Filename: ReadData2.java
//Author: Sailesh Nankani and Joe Lin
//Date: May 11, 2016
//Description: ReadData2 gets the records from the external file, records.txt and stores them in a one dimensional array, data2.

import java.io.*;

/** ReadData2 gets the records from the external file, records.txt and stores them in a one dimensional array, data2.
* @author Joe Lin and Sailesh Nankani*/

class ReadData2
{
   //Read data2 from external file using readFile() method 
   /** Read data2 from external file using readFile() method 
   * @param fname            name of the file that contains the data2
   * @param max              max number of thing in the array */   
   public String[] readFile(String fname, int max)
   {
      //fname = "records.txt"
      String data2[] = new String[max]; //max = maxmum number of records
      
      for(int k = 0; k < max; k++) //initialize data2 array to dtore max records 
         data2[k] = "";
         
      int i = 0; //start counting records
      
      try
      {
         DataInput in = new DataInputStream(new FileInputStream("movies.txt"));
         String txt = in.readLine();
         
         while(txt != null)
         {
            data2[i++] = txt; //store record in array, data2; and Increment i
            txt = in.readLine();
         } //end while
      }catch (Exception e){};
      return data2; //retuen the entire array of record 
   } //end readFile
} //end readData