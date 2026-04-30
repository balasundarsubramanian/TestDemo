package com.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	
	public static Properties p;
	
	
	public ConfigReader() throws IOException {
		
		File f = new File("C:\\Users\\balas\\eclipse-workspace-new26\\Cucumber10AMApr26\\Config.properties");
		FileInputStream fi = new FileInputStream(f);
		p= new Properties();
		p.load(fi);
		
		
	}
	
	public String getUrl() {
		String refurl = p.getProperty("url");
		return refurl;
	}
	
	

}
