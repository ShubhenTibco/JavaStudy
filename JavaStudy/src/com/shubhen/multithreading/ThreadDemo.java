package com.shubhen.multithreading;

public class ThreadDemo {
public static void main(String[] args) {
	Thread t = new MyThread();
	t.start();
}


}
class MyThread extends Thread{
	@Override
	public void run(){
		System.out.println("Thread run");
	}
}