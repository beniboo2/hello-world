import javax.swing.JComponent;
import java.awt.Graphics; 
import java.awt.Color;
import java.awt.Polygon;

import java.awt.Graphics;
import javax.swing.JFrame;

public class greekFlag extends JComponent {
  
  int width, height; 
  public greekFlag(int width, int height) {
    this.width = width;
    this.height = height; 
  }
  
    public static void main(String[] args) {
    JFrame a = new JFrame(); 
    int width = 700, height = 470; 
    a.setVisible(true); 
    a.setSize(width, height); 
    // how can you determine 20, 40 dynamically? 
    greekFlag b = new greekFlag(width, height); 
    a.add(b);  
    }
    
  public void paintComponent(Graphics g) {
    g.setColor(Color.BLUE);
    g.fillRect( 0, 0, 700, 450); // background
    g.setColor(Color.WHITE);
    g.fillRect( 0,  250, 700, 50); // stripe
    g.setColor(Color.WHITE);
    g.fillRect( 0, 350, 700, 50); // stripe
    g.setColor(Color.WHITE);
    g.fillRect( 250, 150, 700, 50);
    g.setColor(Color.WHITE);
    g.fillRect( 250, 50, 700, 50);
    g.setColor(Color.WHITE);
    g.fillRect( 100, 0, 50, 250);
    g.setColor(Color.WHITE);
    g.fillRect( 0, 100, 250, 50);
    //g.fillStar(
 
  }
}