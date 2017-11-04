package com.pp;

public class Hibrid {

	public static void main(String[] args) {
		MultiThrading t =new MultiThrading(20, "hibid approach");
		Thread t1=new Thread(t);
		t1.start();
		
		System.out.println(Thread.currentThread());
		System.out.println(t1.getName());
//		System.out.println(t1.countStackFrames());
		System.out.println(t1.getId());
		System.out.println(t1.getPriority());
		System.out.println(t1.isAlive());
		System.out.println(t1.isDaemon());
		System.out.println(t1.isInterrupted());
		System.out.println(t1.getContextClassLoader().getClass().getName());
		System.out.println(t1.getStackTrace().getClass().getName());
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t1.getState());
		System.out.println(t1.activeCount());
		System.out.println(t1.holdsLock(t));

	}

}
