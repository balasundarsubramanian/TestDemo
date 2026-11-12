package com.propertyfileReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	public static Properties p;

	public ConfigurationReader() throws IOException {

		File f = new File("C:\\Users\\balas\\eclipse-workspace\\AdaCucumber\\Configur.properties");

		FileInputStream fis = new FileInputStream(f);// to read datas

		p = new Properties();

		p.load(fis);

	}

	public static String getUrl() {
		String refur1 = p.getProperty("url");

		return refur1;

	}

	public static String getUser() {

		String refur2 = p.getProperty("user");
		return refur2;
	}

	public static String getPass() {
		String refur3 = p.getProperty("pass");
		return refur3;
	}

}
