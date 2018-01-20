//Filename: Receipt.java
//Author: Joe Lin and Sailesh Nankani
//Date: May 11, 2016
//Description: Receipt is called by the Output.java to print out the record for the name read by keyboard input.

class Receipt

/** Receipt is called by the Output.java to print out the record for the name read by keyboard input.
* @author Joe Lin and Sailesh Nankani*/

{
   /** The printReceipt method finds out the record  for the name entered by user and prints out the late slip.
   * @param data        The one-dimensional array that stores the records.
   * @param input       The input is the String entered by the user    */ 
   public static void printReceipt(String data[][], String input)
   {
      boolean found = false;
      String lastName = "";
      String firstName = "";
      String id= "";
      String homeform = "";
      String date = "";
      String time = "";
      String period = "";
      
      System.out.println(data[0][0]);
      System.out.println(input);
      
      for (int i=0; i<data.length; i++)
      {
         
         if (data[i][0].equals(input))
         {
            found = true; //Check for name
            for (int k=0;k<8; k++)
            {
               switch(k)
               {
              
                  case 1: id=data[i][k]; break;
                  case 2: homeform=data[i][k]; break;
                  case 3: date=data[i][k]; break;
                  case 4: time=data[i][k]; break;
                  case 5: period = data[i][k]; break;
               
               }  // end switch
            } // end for
          } //end if
      
      
      
      } //end outer for
      if (!found)  System.out.println("No record found!\n\n");
      
      else
      {
         System.out.println(" "+"_________________________________");
         System.out.println("|                                 |");
         System.out.println ("|East York C.I.                   |");
         System.out.println("|---------------------------------|");
         System.out.println("|Receipt Type: SIGN IN   Period: "+period+"   |");
         System.out.println("|         : "+date+"   "+time+"      |");
         System.out.println("|---------------------------------|");
         System.out.println("|Reason: LATE                     |");
         System.out.println("|---------------------------------|");
         System.out.println("|Student No: "+id+ "               |");
         System.out.println("|                                 |"); 
                          
         } //end for
         System.out.println("|");
         System.out.println("|                                 |");
         System.out.println("|Home Form: " + homeform+ "                |");
         System.out.println("|"+"_________________________________"+"|");
         } //end else
         
         
      } //end printReceipt
 // end class Receipt
