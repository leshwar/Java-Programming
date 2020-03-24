package library;
public class Book{
int bookid, accessno;
String b_name, a_name, publication ;
Book(int a, int b, String c, String d , String e) {
bookid=a;
accessno=b;
b_name=c;
a_name=d;
publication=e;
}
void display()
{
System.out.println( " ***************BOOK ************");
System.out.println( " book id = " +bookid);
System.out.println( " accessno is " +accessno);
System.out.println( " book name "+b_name);
System.out.println( " author name is " +a_name);
System.out.println( " publications " +publication);
}
}