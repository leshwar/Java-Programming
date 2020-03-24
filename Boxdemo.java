javacclass Box 
{
double width,height,depth,volume;
}

class Boxdemo
{
public static void main(String args[])
{
Box mybox=new Box();
mybox.width=10;
mybox.height=20;
mybox.depth=30;

mybox.volume=mybox.width*mybox.height*mybox.depth;

Box mybox1=mybox;

System.out.println(" "+mybox.volume" "+mybox.width" "+mybox.height" "+mybox.depth);
System.out.println(" "+mybox1.volume" "+mybox1.width" "+mybox1.height" "+mybox1.depth);
}
}