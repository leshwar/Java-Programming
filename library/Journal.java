package library;
public class Journal{
String jname;
int jid;
Journal(int id, String name ) {
jid=id;
jname=name;
}
void display () {
System.out.println("****** journal ******" );
System.out.println("journal name is " +jname);
System.out.println("journal id is " +jid );
}
}