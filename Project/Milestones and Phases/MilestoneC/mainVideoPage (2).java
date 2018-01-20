//Filename: mainVideoPage.java
//Author: Joe Lin and Sailesh Nankani
//Date: May 11, 2016
//Description: NewRecords reads data from records.txt and writes it back to the file with the new record.

import java.io.*;
import javax.swing.*;

/** NewRecords reads data from records.txt and writes it back to the file with the new record.
* @author Joe Lin and Sailesh Nankani*/

class mainVideoPage extends JFrame 
{
	  public mainVideoPage() 
     {
		setTitle("Movies");
		setSize(700,560); // default size is 0,0
		setLocation(10,200); // default is 0,0 (top left corner)
	  }
	
	  public static void main(String[] args) {
	    JFrame f = new mainVideoPage();
	    f.show();
	  }
}

