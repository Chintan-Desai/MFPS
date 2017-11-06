package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider 
{
	Properties pro;
	
	public ConfigDataProvider()
	{
		String path=System.getProperty("user.dir")+"/Configuration/config.properties";
		
		try {
			FileInputStream fis=new FileInputStream(new File(path));
			
			pro=new Properties();
			
			pro.load(fis);
		} catch (Exception e) {
			
			System.out.println("Unable to read configuration file "+e.getMessage());
		}
	}
	public String getBrowser()
	{
		String browserDetails=pro.getProperty("Browser");
		return browserDetails;
	}
	
	public String getTestUrl()
	{
		String urlDetails=pro.getProperty("StagingUrl");
		return urlDetails;
	}
	
	public String getDetails(String key)
	{
		String details=pro.getProperty(key);
		return details;
	}

	public String getUsername(String uname)
	{
		return uname = pro.getProperty("username");
	}

	public String getPassword(String pwd)
	{
		return pwd = pro.getProperty("password");
	}
}
