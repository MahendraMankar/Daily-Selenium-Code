package advanceProgram;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertySample1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src\\test\\resources\\commondata.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty("url");
		String UN = prop.getProperty("username");
		String PWD = prop.getProperty("password");
		
	}

}
