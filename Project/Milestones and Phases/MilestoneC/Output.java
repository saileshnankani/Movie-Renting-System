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
   void keyIn (String data[][], String txt)
   {
      int item = 0;
      String input;
      Receipt s = new Receipt();
      for (int a =0; a<data.length; a++)
      {
         {
            for (int b =0; b<data[a].length; b++)
            {
               System.out.println(data[a][b]);
            
            }
         }
      }
      System.out.println("Printing... \n");
      //s.printReceipt(data, txt);   
   
   }  // end keyIn

} // end Output