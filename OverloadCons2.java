class Box {
double width;
double height;
double depth;
// construct clone of an object
Box(Box ob) {
// pass object to constructor
width = ob.width;
height = ob.height;
depth = ob.depth;
}
// constructor used when all dimensions specified
Box(double w, double h, double d) {
width = w;
height = h;
depth = d;
}
double volume() {
return width * height * depth;
}}
class OverloadCons2 {
public static void main(String args[]) {
// create boxes using the various
Box mybox1 = new Box(10, 20, 15);
Box myclone = new Box(mybox1);
double vol;
// get volume of first box
vol = mybox1.volume();
System.out.println("Volume of mybox1 is " + vol);
/// get volume of clone
vol = myclone.volume();
System.out.println("Volume of clone is " + vol);
}}