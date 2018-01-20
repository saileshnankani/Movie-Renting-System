//Filename: SubMenus.java
//Author: Joe Lin and Sailesh Nankani
//Date: May 11, 2016
//Description: SubMenu creates a submenu within a menu item.

import java.awt.*;

/** SubMenu creates a submenu within a menu item.
* @author Joe Lin and Sailesh Nankani*/

public class SubMenus extends Frame
{
   /**  Constructor that prepares the display and initiates the menu   */
   public SubMenus()
   { 
   // constructor
   super("SUB-MENUS");
   resize(200, 200);
   makeMenus();
   show();
   }
   
   /**   Method to instantiate menubar.  */
   private void makeMenus()
   {
      MenuBar mb = new MenuBar(); // Instantiate menubar
      Menu mi = new Menu("Info");  // Get new menu - Info
      Menu ms = new Menu("Sort");  // Create Sort as a menu item
      ms.add(new MenuItem("Phones"));           // submenuu inside Sort
      ms.add(new MenuItem("Names"));            // submenu inside Sort
      mi.add(ms);    // add Sort menu inside info
      mi.add(new MenuItem("Quit"));       // Add Quit menu item
      Menu mf = new Menu("Find");      // get new menu-Data
      mf.add(new MenuItem("Clients")); // menu item
      mf.add(new MenuItem("DVDs"));    // menu item
      mb.add(mi);   //Add info to menubar
      mb.add(mf);   //Add Find to menubar
      setMenuBar(mb);     // show menubar
   }
   
   /**  Activates menuitem.   */
   public boolean action(Event evt, Object obj)
   {
      if(evt.target instanceof MenuItem){
         String label = (String) obj;
      if (label.equals("Quit"))
         System.exit(0);
      else if (label.equals("Phones"))
         System.out.println("Phones checked!");
      else if (label.equals("Names"))
         System.out.println("Client names here!");
      else if (label.equals("Clients"))
         System.out.println("Clients here!");
      else if (label.equals("DVDs"))
         System.out.println("DVDs here!");
   
   }
   return true;
   
}
   /**  Instantiates SubMenus class.  */
   public static void main(String srt[])
   {
      new SubMenus();
   }
   
}