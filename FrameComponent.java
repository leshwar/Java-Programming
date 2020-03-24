import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code = "FrameComponent" width =250 height = 200>
</applet> */
public class FrameComponent extends Applet implements ActionListener,ComponentListener
{
    Frame f1;
    TextArea ta1;
    Button b1, b2;
    public void init()
{
        f1 = new Frame("Frame With Component");
        ta1 = new TextArea(20,20);
        b1 = new Button("Show");
        b2 = new Button("Hide");

        add(b1);
        add(b2);
        add(ta1);
       
        b1.addActionListener(this);
        b2.addActionListener(this);
        f1.addComponentListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1)
        {
            f1.setVisible(true);
        }
        else
        if(e.getSource() == b2)
        {
            f1.setVisible(false);
        }
    }
    public void componentShown(ComponentEvent e1)
    {
        ta1.append("Shown\n");
    }
    public void componentHidden(ComponentEvent e1)
    {
        ta1.append("Hidden\n");
    }
    public void componentMoved(ComponentEvent e1)
    {
        ta1.append("Moved\n");
    }
    public void componentResized(ComponentEvent e1)
    {
        ta1.append("Resized\n");
    }
}
