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


	protected synchronized static void PropLoad() throws FileNotFoundException, IOException {
		Properties prop = new Properties();

		InputStream config = new FileInputStream("config.ini");
		prop.load(config);
		setMessage(prop.getProperty("Message"));
	}

	protected synchronized static String getMessage() {
		return Message;
	}

	protected synchronized static void setMessage(String string) {
		Message = string;
	}
}
