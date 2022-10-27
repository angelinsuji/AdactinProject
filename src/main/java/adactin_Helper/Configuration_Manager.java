package adactin_Helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Manager {
public static Properties ps = new Properties();
	
	public Configuration_Manager() {
		try {
			//load the file path
			File file = new File("C:\\Users\\Angelin suji\\eclipse-workspace\\AdactinProject\\config.properties");
		//read the file
			FileInputStream fis = new FileInputStream(file);
			
			ps.load(fis);
			
		}catch(Exception e) {
			
			e.printStackTrace();
			System.out.println(e);
		}
	}
	public String getURL() {
		String url = ps.getProperty("url");
		
		if(url == " "&& url == null) {
			System.out.println("url not found in property file");
		}
		return url;
		
	}
	
	public String getbrowser() {
		String browser = ps.getProperty("browser");
		if(browser == " " && browser == null) {
			System.out.println("browser not found in property file");
		}
		return browser;
		
	}

}
