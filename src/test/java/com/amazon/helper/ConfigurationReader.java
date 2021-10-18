package com.amazon.helper;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
public class ConfigurationReader {
	public static Properties p;
 public ConfigurationReader() throws Throwable {
	File file = new File("C:\\Users\\saran\\eclipse-workspace\\amazon\\src\\test\\java\\com\\amazon\\helper\\configuration.properties");
    FileInputStream fis = new FileInputStream(file);
    p = new Properties();
    p.load(fis);
 }
 public String getBrowser() {
	String browser = p.getProperty("browser");
	return browser;
}
 public String getUrl() {
	String url = p.getProperty("url");
	return url;
}
}
