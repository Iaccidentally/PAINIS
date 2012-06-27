package com.l.ol;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try {
			new ThreadPool();
			PropLoader.PropLoad();
			ThreadPool.addTask(new Logger("Started up!"));
			ThreadPool.addTask(new PAINIS());
		} catch (IOException e) {
			System.out.println("You dont have PAINIS running correctly!");
			e.printStackTrace();
		}
	}
}
