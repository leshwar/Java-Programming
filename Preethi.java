 
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
 
/*
        <applet code = "Preethi" width = 800 height = 800>
        </applet>
*/
 
public class Preethi extends Applet{
       
        public void paint(Graphics g){
               
                Color c[] = {Color.blue, Color.gray,Color.green, Color.lightGray, Color.magenta, Color.orange, Color.pink,
                                Color.red, Color.yellow,Color.cyan};
               
                for(int  i = 0; i<c.length; i++){
                        g.setColor(c[i]);
                        g.drawString("Hello World...",10,(i*10));
                }
        }
}