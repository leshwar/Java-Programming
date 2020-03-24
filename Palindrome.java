class Palindrome {
public static void main (String args[]) {
int a,num, rev=0,rem;
//System.out.println("get the input from the user ");
a=Integer.parseInt(args[0]);
num=a;
while (num!=0)

num=num%2;
rev=(num*10 )+rev;
num=num/10;


System.out.println("Reversal num is " +rev );
if(a==rev)
System.out.println("palindrome " +a);
else
System.out.println("not a palindrome "+a);
}
}