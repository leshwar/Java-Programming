import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="Keyboard1.java" width=200 height=200>
</applet>
*/
public class Keyboard1 extends Applet implements KeyListener, MouseListener 
{
int x, y;
String s ;
public void init() {
setBackground( Color.black );
addMouseListener( this );
addKeyListener( this );
}
public void mouseEntered( MouseEvent e )
 {showStatus("Mouse Entered");}
public void mouseExited( MouseEvent e )
{showStatus("Mouse Exited");}
public void mousePressed( MouseEvent e )
{showStatus("Mouse Pressed");}
public void mouseReleased( MouseEvent e )
{showStatus("Mouse Released");}
public void mouseClicked( MouseEvent e ) 
{
x = e.getX();
y = e.getY();
s = "";
repaint();
}
public void keyPressed( KeyEvent e ) {
showStatus("Key down");
}
public void keyReleased( KeyEvent e ) { 
showStatus("Key up");
}
public void keyTyped( KeyEvent e ) {
char c = e.getKeyChar();
if ( c != KeyEvent.CHAR_UNDEFINED ) {
s = s + c;
repaint();
}
}
public void paint( Graphics g ) {
g.setColor( Color.red);
g.drawLine( x, y, x, y-20 );
g.drawLine( x, y, x+20, y );
g.setColor( Color.white );
g.drawString( s, x, y );
}
}
