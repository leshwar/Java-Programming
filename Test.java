import java.applet.*;

import java.awt.event.*;
import java.awt.*;

//<applet code = Test width = 400 height = 400></applet>
public class Test extends Applet implements MouseListener
{
    int x, y, oldx, oldy, count;
   public void init()
    {

        addMouseListener(this);

    }

    public void mouseEntered(MouseEvent me){}
    public void mouseExited(MouseEvent me){}
    public void mousePressed(MouseEvent me){}
    public void mouseClicked(MouseEvent me)
    {
        if(count == 0)
        {
            x = me.getX();
            y = me.getY();
            count++;
        }
        else
        {
            oldx = x;
            oldy = y;
            x = me.getX();
            y = me.getY();
            count++;
        }
        repaint();
    }
    public void paint(Graphics g)
    {

        g.drawLine(x, y, oldx, oldy);
    }
    public void mouseReleased(MouseEvent me){}
}