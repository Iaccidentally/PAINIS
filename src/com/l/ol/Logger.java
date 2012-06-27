package com.l.ol;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger extends Thread {
	String message;

	Logger(String message) {
		this.message = message;
	}

	@Override
	public void run() {
		try {
			File Log = new File("PAINIS.log");
			FileWriter outFile = new FileWriter(Log, true);
			PrintWriter out = new PrintWriter(outFile);
			out.println(message);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
