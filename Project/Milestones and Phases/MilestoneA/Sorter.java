//Filename: Sorter.java
//Author: Sailesh Nankani and Joe Lin
//Date: May 11, 2016
//Description: It sorts all records by Names (0), IDs (1), homeforms (2), and Periods (5).

/** It sorts all records by Names (0), IDs (1), homeforms (2), and Periods (5).
* @author Joe Lin and Sailesh Nankani*/

class Sorter

{
   /** Sorts the list by names, ID, class, etc.
   * @param list          Two dimensional array that stores the records to be sorted.
   * @param item          Specifies the list to be sorted by names, ids, homeforms or periods  */
   public static String[][]sort(String list[][], int item)
   {
      //input records; item = name etc
      String temp;
      
      int len = list.length -1;
      
      for (int i = len; i > 1; i--) 
      {
         for (int j = 0; j < i; j++)
         {
            if (list[j][item].compareTo(list[j+1][item]) > 0)
            {
               for (int k = 0; k < 6; k++)
               {
                  swap(list, j, k); //sawpping all 6 items
               
               }
            } //end if
         }
      }
      return list; //return sorted list 
   }
   /** Sorts array by exchanging the larger values with the smaller one. 
   * @param list          Two dimensional array that stores the records to be sorted.
   * @param index         The index of the value that corresponds to the value that is being compared. 
   * @param item          Specifies the list to be sorted by names, ids, homeforms or periods     */                  
   static void swap(String list[][], int index, int item)
   {
      String temp;
      temp = list[index][item];
      list[index][item] = list[index + 1][item];
      list[index + 1][item] = temp;
   } //end sawp
} //end Sorter