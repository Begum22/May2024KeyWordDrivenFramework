package com.facebook_utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestReader {

	Properties prop;  //instance variable
	
	public TestReader() {
		prop = new Properties(); // Properties class only able to read
		
		String filePath="src/test/resources/Test.properties";
		
		// bridge to bring data in 
		FileInputStream fis;
		try {
		  fis = new FileInputStream( filePath);
		 prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	


public String readBrowser() {
	return prop.getProperty("Browser");
}
	
public String readUrl() {
	return prop.getProperty("url");
	
}

public String readuserName() {
	return prop.getProperty("username");
	
}
public String readPassword() {
	return prop.getProperty("password");
}


public TestReader(Properties prop) {
	super();
	this.prop = prop;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestReader ap = new TestReader();
		System.out.println(ap.readBrowser());
		System.out.println(ap.readUrl());

	}

}
