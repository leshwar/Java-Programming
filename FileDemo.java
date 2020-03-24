FileDemo.java
import java.io.*;
public class FileDemo{
public static void main(String args[]){
File file=new File("hello.txt");
System.out.println("File hello exists ? "+file.exists());
file.createNewFile();
System.out.println("File hello exists ? "+file.exists());
File dir=new File("sample\\ sam");
dir.mkdir();
}
}