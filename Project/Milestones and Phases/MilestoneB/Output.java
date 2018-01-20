//Filename: Output.java
//Author: Joe Lin and Sailesh Nankani
//Date: May 11, 2016
//Description: Output reads a name from keyboard input and calls printReceipt() method from Receipt.class to print a record.

import java.io.*;

/** Output reads a name from keyboard input and calls printReceipt() method from Receipt.class to print a record.
* @author Joe Lin and Sailesh Nankani*/

class Output
{
   /** The keyIn method reads a name from keyboard input and calls the printReceipt() method to print a record.
   * @param data        The one-dimensional array that stores the records.   */
   void keyIn (String data[][])
   {
      int item = 0;
      DataInput d = new DataInputStream(System.in);
      String input;
      Receipt s = new Receipt();
      try
      {
         System.out.println("Enter name to be printed:");
         while ((input =d.readLine()) != null)
         {
            System.out.println("Printing... \n");
            s.printReceipt(data, input);
         } // end while
         
      }  catch (IOException ignore){}
   
   
   }  // end keyIn

} // end Output