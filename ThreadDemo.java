package com.pp;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
			MultiThrading  t1=new MultiThrading(14,"thread t1");
			MultiThrading.t2=Thread.currentThread();
            /*ThredByRunnable t3=new ThredByRunnable(); 
			Thread t4 =new Thread(t3,"runablethread");*/
             t1.start();
             
			
             for (int i = 0; i <10; i++) {
 				System.out.println("mainthrad");
 				try {
 					Thread.sleep(6);
 				} 
 				catch (InterruptedException e) {
 					e.printStackTrace();
 				}
             }
			
			
			
			
			

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			/*t4.setPriority(10);
	
			t1.start();
			t2.start();
			t4.start();
			System.out.println(t4.getPriority());
			System.out.println(t1.getName());
			System.out.println(t2.getName());
			System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
			System.out.println(t1.currentThread().getName());
			
			t3.run();
			for (int i = 0; i <1; i++) {
				System.out.println("mainthrad");
				try {
					Thread.sleep(6);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
*/			
	}}
