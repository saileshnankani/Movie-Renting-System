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
      String ratings = "";
      String runtime = "";
      
      for (int i=0; i<data.length; i++)
      {
         if (data[i][0].equals(input))
         {
            found = true; //Check for name
            for (int k=0;k<6; k++)
            {
               switch(k)
               {
                  case 0: {
                          lastName = data[i][k].substring(0, data[i][k].indexOf(" "));
                          firstName = data[i][k].substring(data[i][k].indexOf(" ") +1);
                          break;
                          } //Separate first and last name
                          
                  case 1: id=data[i][k]; break;
                  case 2: homeform=data[i][k]; break;
                  case 3: date=data[i][k]; break;
                  case 4: ratings=data[i][k]; break;
                  case 5: runtime = data[i][k]; break;
               
               }  // end switch
            } // end for
          } //end if
      
      
      
      } //end outer for
      if (!found)  System.out.println("No record found!\n\n");
      
      else
      {
         System.out.println(" "+"_________________________________");
         System.out.println("|                                 |");
         System.out.println ("|East York Video Rentals          |");
         System.out.println("|---------------------------------|");
         System.out.println("|Time: "+runtime+"                      |");
         System.out.println("|Year: "+date+"                       |");
         System.out.println("|Category: "+id+ "                 |");
         System.out.println("|                                 |");
         String line = "|Last Name: " + lastName; 
         int num = line.length()-1;
         int space = 32-num;
         for (int c=0; c<=num+1;c++)
         {
            if (c==num+1)
               for (int s =0; s<=space; s++)
                  System.out.print(" ");
            
            else
               System.out.print(line.charAt(c));              
         }
         System.out.println("|");
         String line2 = "|First Name: " + firstName;
         int num2 = line2.length()-1;
         int space2 = 32-num2;
         for (int c = 0;c<=num2+1;c++)
         {
            if (c==num2+1)
               for (int s =0; s<=space2; s++)
                  System.out.print(" ");
            else
               System.out.print(line2.charAt(c));
                 
         } //end for
         System.out.println("|");
         System.out.println("|                                 |");
         System.out.println("|Movie: " + homeform+ "                  |");
         System.out.println("|"+"_________________________________"+"|");
         } //end else
         
         
      } //end printReceipt

} // end class Receipt
