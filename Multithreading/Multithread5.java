class A extends Thread
{
	public void run()
	{
		for(int i=1;i<10;i++){
		System.out.println("A:"+isAlive()+i);
	}}
}

class Dcoder{
	public static void main (String args[])
	{
	A a = new A();
	a.start();

	try {
			a.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	A b = new A();
	b.start();
	System.out.println("A:"+a.isAlive());
	
}
}
    
