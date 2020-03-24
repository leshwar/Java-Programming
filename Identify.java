import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class Identify extends Applet  implements MouseListener {
 
  private int x = 0, y = 0; 
    
  public void init() {
    addMouseListener(this);
  }
  
  public void paint(Graphics g) {
    if (0 <= x && x < 100 && 0 <= y && y < 100) { 
       g.setColor(Color.red);
       g.fillRect(0, 0, 100, 100);
    }
    if (100 <= x && x <= 200 && 0 <= y && y < 100) { 
       g.setColor(Color.blue);
       g.fillRect(100, 0, 100, 100);
    }
    if (0 <= x && x < 100 && 100 <= y && y <= 200) { 
       g.setColor(Color.green);
       g.fillRect(0, 100, 100, 100);
    }
    if (100 <= x && x <= 200 && 100 <= y && y <= 200) { 
       g.setColor(Color.yellow);
       g.fillRect(100, 100, 100, 100);
    }  
  }
  
  public void mouseClicked(MouseEvent e) {
    x = e.getX();
    y = e.getY();
    repaint();
  }

  public void mouseExited(MouseEvent e) { }

  public void mouseEntered(MouseEvent e) { }

  public void mousePressed(MouseEvent e) { }

  public void mouseReleased(MouseEvent e) { }
}
