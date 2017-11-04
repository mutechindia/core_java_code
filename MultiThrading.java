package com.pp;

public class MultiThrading extends Thread {
	int i;
	String s;
	static Thread t2;

	public MultiThrading(int j, String s) {
		this.i = j;
		this.s = s;
	}

	public void run() {
		for (int j = 0; j < i; j++) {
			System.out.println(s);
			// Thread.yield();
			try {
				t2.join();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
	}

	public void run(int a) {
		for (int i = 0; i < a; i++) {
			System.out.println("thread job run method");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
