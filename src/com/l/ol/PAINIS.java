package com.l.ol;

public class PAINIS implements Runnable {

	String message;
	int mes;

	PAINIS() {
		this.message = PropLoader.getMessage();
	}

	@Override
	public void run() {
		do {
			System.out.println(this.message);
			mes++;
		} while (true);
	}
	
	public synchronized int getSent() {
		return mes;
	}
}
