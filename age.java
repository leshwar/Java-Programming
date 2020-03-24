import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code="age" width=400 height= 400 >
</applet>
*/
public class age extends Applet implements ActionListener {
int month, year,mm,yy;
Button calc;
TextField m,d,y;
public void init() 
{
Label dp=new Label("Date : " );
Label mp=new Label("month: ");
Label yp=new Label("year: ");
d=new TextField(4);
m=new TextField(4);
y=new TextField(4);
add(dp);
add(d);
add(mp);
add(m);
add(yp);
add(y);
//d.addActionListner(this);
//m.addActionListner(this);
//y.addActionListner(this);
calc=new Button("calculate age");
add(calc);
//calc.addActionListner(this);
}
public void actionPerformed(ActionEvent ae)
{
repaint(); 
}
public void paint(Graphics g){
try 
{
yy=Integer.parseInt(y.getText());
mm=Integer.parseInt(m.getText());
year=2012-yy;
month=12-mm;}
catch(Exception e) { }
g.drawString("years" +year+ "months" +month, 6,100);
}
}