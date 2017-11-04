package com.pp;

public class ThredByRunnable implements Runnable{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("thread runnable job");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


