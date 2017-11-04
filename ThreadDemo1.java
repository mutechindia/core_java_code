class MyThread extends Thread
{
	MyThread(){
		start();
	}
	public void run()
	{
		for(int i=0;i<12;i++)
		{
			try
			{
			System.out.println("thread");
			Thread.sleep(100);
			}
			catch(Exception e)
			{}
		}
		
	}
}
public class ThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1=new MyThread();
		System.out.println(t1.getName());
		//t1.start();
       
	}

}
