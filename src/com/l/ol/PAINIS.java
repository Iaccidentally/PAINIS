package com.l.ol;

public class PAINIS implements Runnable {

	String message;
	public volatile static int mes;

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
	
	protected synchronized int getSent() {
		return mes;
	}
}
