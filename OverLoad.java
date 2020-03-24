class Box{
double wid;
double hei;
double dep;

Box(Box ob) {
wid=ob.wid;
hei=ob.hei;
dep=ob.dep;
}
Box(double w,double h,double d){
wid=w;
hei=h;
dep=d;
}
double volume()
{
return hei*dep*wid;
}
}
class OverLoad{
public static void main(String args[]) {
Box mybox1=new Box(10,20,15);
Box myclone=new Box(mybox1);
double vol;
vol=mybox1.volume();
System.out.println("Vol is " +vol);
vol=myclone.volume();
System.out.println("vol of clone is " +vol );
}
}