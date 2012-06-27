package com.l.ol;

public class PAINIS implements Runnable {

	String message;

	PAINIS() {
		this.message = PropLoader.getMessage();
	}

	@Override
	public void run() {
		do {
			System.out.println(this.message);
		} while (true);
	}
}
