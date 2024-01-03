package com.demo;

class MyThread extends Thread {
	private String threadName;

	public MyThread(String name) {
		this.threadName = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(threadName + ": " + i);

			try {
				// Adding a short delay to increase the chances of interleaving
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadExample {

	public static void main(String[] args) {
		MyThread thread1 = new MyThread("Thread A");
		MyThread thread2 = new MyThread("Thread B");

		// Start both threads
		thread1.start();
		thread2.start();

	}

}
