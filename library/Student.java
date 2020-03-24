package library;
public class Student{
int sid;
String sname, deptname;
Student (int a, String b , String c) {
sid=a;
sname=b;
deptname=c;
}
void display ()
{
System.out.println("*****Student****** ");
System.out.println("student name is "+sname);
System.out.println("student id is " +sid);
System.out.println("department name is "+deptname);
}

}