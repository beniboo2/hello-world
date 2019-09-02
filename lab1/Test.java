import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test
{
  public static void main(String[] args) throws Exception
  {
    URL imageLocation = new URL(
          "https://i.ytimg.com/vi/GamrGWlXD9s/maxresdefault.jpg");
    JOptionPane.showMessageDialog(null, "You've been bamboozled!", "Title",
          JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
  }
}