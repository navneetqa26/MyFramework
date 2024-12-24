package bstackUtilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	public String getURL() throws IOException
	{
		Properties properties = new Properties();
		FileReader fileReader = new FileReader("C:\\Users\\HP\\eclipse-workspace\\FrameWorkLessons\\configs.properties");
		properties.load(fileReader);
		return properties.getProperty("URL");
	}

}
