//Filename: NewRecord.java
//Author: Joe Lin and Sailesh Nankani
//Date: May 11, 2016
//Description: NewRecords reads data from records.txt and writes it back to the file with the new record.

import java.io.*;

/** NewRecords reads data from records.txt and writes it back to the file with the new record.
* @author Joe Lin and Sailesh Nankani*/

class NewRecord
{
   /** The addRecord method reads data from the external file, records.txt, and write back to file with new record.
   * @param fileName    The name of the external file which contains the record.
   * @param newRec      The String that is returned from KeyInput method that contains the String suitable for insertion    */ 
   public static void addRecord(String fileName, String newRec)
   {
      String txt[] = new String[50];
      int count = 0;
      try 
      {
         DataInput f1 = new DataInputStream(new FileInputStream(fileName));
         txt[count] = f1.readLine();
         while(txt[count]!=null)
         {
            // Read all records from file
            ++count;
            txt[count]=f1.readLine();
         }
         DataOutput f2 = new DataOutputStream(new FileOutputStream(fileName));
         for (int i=0; i<count; i++)
         {
            f2.writeBytes(txt[i] + "\r\n"); // Write to file
            System.out.println(txt[i]);
            System.out.print(newRec);
         }
         f2.writeBytes(newRec); // Insert new record
         
         
      }  catch(Exception e) {}
   } // end addRecird 

}  //end Newrecord 