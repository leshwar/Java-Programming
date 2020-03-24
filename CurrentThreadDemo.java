class CurrentThreadDemo {
public static void main (String args[]) {
Thread t=Thread.currentThread();
System.out.println("current thread is:            " +t);
t.setName("My First Thread ");
System.out.println("After name change:            " +t);
try {
for(int n=10;n>0;n--) {
System.out.println(n);
Thread.sleep(1000);
}
}
catch(InterruptedException e) {
System.out.println("Main Thread Interrupted " );
}
}
}