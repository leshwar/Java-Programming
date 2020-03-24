package library;
public class Displayall{
public static void main(String args[]) {
Book b= new Book ( 1,100,"c++","balaguruswamy","gbmnu");
Journal j=new Journal(1,"sakshi");
Student s=new Student (10,"mahesh","cse");
//Scanner inp=new Scanner (System.in);{
//b=new Book();
b.display();
j.display();
s.display();
}
}