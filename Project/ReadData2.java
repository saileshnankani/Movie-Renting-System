//Filename: ReadData2.java
//Author: Joe Lin, Sailesh Nankani and Annie Sun
//Date: June 15, 2016
//Description: ReadData2 gets the records from the external file, movies.txt and stores them in a one dimensional array, data2.

import java.io.*;

/** ReadData2 gets the records from the external file, movies.txt and stores them in a one dimensional array, data2.
* @author Annie Sun, Joe Lin and Sailesh Nankani*/

class ReadData2
{
   //ReadData2 from external file using readFile() method 
   /** ReadData2 from external file using readFile() method 
   * @param fname            name of the file that contains the data2
   * @param max              max number of thing in the array 
   * @return data2           the one dimensional array that stores record from external file, movies.txt. */   
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