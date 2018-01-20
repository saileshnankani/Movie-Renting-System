//Filename: UpdateRecords.java
//Author: Joe Lin and Sailesh Nankani
//Date: May 11, 2016
//Description: UpdateRecords reads all records and writes them back to the external file, records.txt.


import java.io.*;

/** UpdateRecords reads all records and writes them back to the external file, records.txt.
* @author Joe Lin and Sailesh Nankani*/

class UpdateRecords
{
   /**  Readds all records and writes them back to the external file, records.txt. 
   * @param fileName    The name of the external file which contains the record.
   * @param data        The one-dimensional array that stores the records.   */
   public static void updateFile(String fileName, String data[][]) 
   
   
   {  //records.text
      try
      
      {
         File in = new File(fileName);
         FileOutputStream myout = new FileOutputStream(in);
         DataOutputStream myData = new DataOutputStream(myout);
         for (int i=0; i<data.length;i++)    
         {  //update records
            String txt = "";
            if (data[i][0].equals("")) continue;  // Omit the record
            for (int j =0; j<6; j++)
               txt += data[i][j] +"#";
            myData.writeBytes(txt + "\r");
         
         }
         
         myout.close();       
      
      }  catch(Exception e) {}
   
   }
}