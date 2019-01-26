class A extends Thread
{
public void run()
{
for(int i=1;i<10;i++)
{
if(i==2||i==7)
yield();
System.out.println("A"+i);
}
System.out.println("A Exit");
}
}
class B extends Thread
{
public void run()
{
for(int i=1;i<5;i++)
{
System.out.println("B"+i);
}
System.out.println("B Exit");
}
}
class YieldTest
{
public static void main(String args[]){
A a=new A();
B b=new B();
a.start();
b.start();
}
}