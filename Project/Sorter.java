//Filename: Sorter.java
//Author: Joe Lin, Sailesh Nankani and Annie Sun
//Date: June 15, 2016
//Description: It sorts all the records by Names (2), Year(3), Runtime(5) and Ratings(4).

/** It sorts all the records by Names (2), Year(3), Runtime(5) and Ratings(4).
* @author Annie Sun, Joe Lin and Sailesh Nankani*/

class Sorter

{
   /** Sorts the list by names, ID, class, etc.
   * @param list          Two dimensional array that stores the records to be sorted.
   * @param item          Specifies the list to be sorted by names, ids, homeforms or periods 
   * @return list         The sorted two dimensional array that stores the records to be stored.        */
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