import java.awt.*;
import java.awt.event.*;

public class MouseClick {
  Label lbl;
  public static void main(String[] args) {
  MouseClick MC = new MouseClick();
  }

  public MouseClick(){
  Frame f = new Frame("Checking the mouse click");
  Panel p = new Panel();
  Button button = new Button("Click Me");
  button.addMouseListener(new MyMouseListener());
  p.add(button, BorderLayout.NORTH);
  f.add(p,BorderLayout.NORTH);
  lbl = new Label("Roseindia.net");
  f.add(lbl, BorderLayout.CENTER);
  f.addWindowListener(new WindowAdapter(){
  public void windowClosing(WindowEvent we){
  System.exit(0);
  }
  });
  f.setSize(400,400);
  f.setVisible(true);
  }
  
  public class MyMouseListener extends MouseAdapter{
  public void mouseClicked(MouseEvent me){
  String str = lbl.getText();
  if (str.equals("Roseindia.net")){
  lbl.setText("You have clicke the button.");
  }
  else if (str.equals("You have clicke the button.")){
  lbl.setText("Roseindia.net");
  }
  }
  }
}