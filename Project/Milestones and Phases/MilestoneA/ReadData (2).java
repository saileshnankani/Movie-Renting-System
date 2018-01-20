//Filename: ReadData.java
//Author: Sailesh Nankani and Joe Lin
//Date: May 11, 2016
//Description: ReadData gets the records from the external file, records.txt and stores them in a one dimensional array, data.

import java.io.*;

/** ReadData gets the records from the external file, records.txt and stores them in a one dimensional array, data.
* @author Joe Lin and Sailesh Nankani*/

class ReadData
{
   //Read data from external file using readFile() method 
   /** Read data from external file using readFile() method 
   * @param fname            name of the file that contains the data
   * @param max              max number of thing in the array */   
   public String[] readFile(String fname, int max)
   {
      //fname = "records.txt"
      String data[] = new String[max]; //max = maxmum number of records
      
      for(int k = 0; k < max; k++) //initialize data array to dtore max records 
         data[k] = "";
         
      int i = 0; //start counting records
      
      try
      {
         DataInput in = new DataInputStream(new FileInputStream("customers.txt"));
         String txt = in.readLine();
         
         while(txt != null)
         {
            data[i++] = txt; //store record in array, data; and Increment i
            txt = in.readLine();
         } //end while
      }catch (Exception e){};
      return data; //retuen the entire array of record 
   } //end readFile
} //end readData