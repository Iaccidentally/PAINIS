package com.l.ol;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


/**
 * 
 * @author boom27777777
 *
 */
public class PropLoader {

	private static String Message;


	public synchronized static void PropLoad() throws FileNotFoundException, IOException {
		Properties prop = new Properties();

		InputStream config = new FileInputStream("config.ini");
		prop.load(config);
		setMessage(prop.getProperty("Message"));
	}

	public synchronized static String getMessage() {
		return Message;
	}

	public synchronized static void setMessage(String string) {
		Message = string;
	}
}
