package com.l.ol;

import java.util.ArrayList;
import java.util.List;

public class ThreadPool extends Thread {

	private static volatile List<Runnable> r = new ArrayList<Runnable>();

	public static void addTask(Runnable r) {
		ThreadPool.r.add(r);
	}

	ThreadPool() {
		this.start();
		this.setPriority(MAX_PRIORITY);
	}

	@Override
	public void run() {
		do {
			while (ThreadPool.r.size() > 0) {
				ThreadPool.r.get(0).run();
				ThreadPool.r.remove(0);
			}
		} while (true);
	}
}
