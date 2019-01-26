class thread1 extends Thread{
public void run(){
for(int i=1;i<6;i++)
{
System.out.println("thread1 "+i);
try{
if(i==2)
sleep(3000);
}
catch(Exception e){
System.out.println(e);
}
}
System.out.println("exit thread1...");
}
}
class thread2 implements Runnable
{
public void run()
{
for(int i=1;i<5;i++)
{
System.out.println("thread2 "+i);
}
System.out.println("Exit thread2...");
}
}
class ThreadTest3{
public static void main(String args[]){
thread1 t1=new thread1();
thread2 t2=new thread2();
Thread t=new Thread(t2);
t1.start();
t.start();
}
}
