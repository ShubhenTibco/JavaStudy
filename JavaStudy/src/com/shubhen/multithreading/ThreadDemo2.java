package com.shubhen.multithreading;

public class ThreadDemo2 {
public static void main(String[] args) {
	Thread t=new Thread(new MyRunnable());
	t.start();
}
}

class MyRunnable implements Runnable{
	@Override
	public void run(){
		System.out.println("Inside runnable");
	}
}
