//Filename: ImageLabel.java
//Author: Joe Lin, Sailesh Nankani and Annie Sun
//Date: June 15, 2016
//Description: ImageLabel class creates a method ImageLabel that enables insertion of pictures in JPanel.

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/** ImageLabel class creates a method ImageLabel that enables insertion of pictures in JPanel.
* @author Annie Sun, Joe Lin and Sailesh Nankani*/

class ImageLabel extends JLabel {

  /** ImageLabel creates new ImageIcon
  * @param img    The imported image. */
  public ImageLabel(String img) {
    this(new ImageIcon(img));
  }

  /** ImageLabel creates an icon out of the image. 
  * @param icon   The icon that contains the imported image. */
  public ImageLabel(ImageIcon icon) {
    setIcon(icon);
    setBorder(null);
    setText(null);
    setSize(icon.getImage().getWidth(null), icon.getImage().getHeight(null));
  }
}