package com.threads;



/*
 * @author Eshwar Iyer
 * Two threads are created which handles the printing of even num and odd num. Both the thread starts,
 * and if the num is odd then Odd thread prints the num and increments it, notifies the other thread
 *  at the same time the even thread waits for the other thread to call notify.
 */

public class ThreadPrintOddEvenNumber {
	
	private int num = 0;
	private int limit = 21;
	private Object lock = new Object();
	

	public static void main(String[] args) {
		
		ThreadPrintOddEvenNumber obj = new ThreadPrintOddEvenNumber();
		EvenThread evenObj = obj.new EvenThread();
		OddThread oddObj = obj.new OddThread();
		
		Thread evenThread = new Thread(evenObj);
		Thread oddThread = new Thread(oddObj);
		
		evenThread.start();
		oddThread.start();
				
	}

	
	public class OddThread implements Runnable{

		@Override
		public void run() {
			
			while(num <= limit) {
				synchronized(lock){
					if(num % 2 != 0) {
						System.out.println("Odd num : " + num);
						num++;
						lock.notify();
					}else {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					
				}
			}
		}
		
	}
	
	public class EvenThread implements Runnable{

		@Override
		public void run() {
			
			while(num <= limit) {
				synchronized(lock){
					if(num % 2 == 0) {
						System.out.println("Even num : " + num);
						num++;
						lock.notify();
					}else {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					
				}
			}
		}
		
	}
	
	
}
