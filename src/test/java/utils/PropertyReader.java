package utils;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertyReader {

	private static Properties config;

	static {

		try {
			Path path = Paths.get(System.getProperty("user.dir"), "/src/test/resources/configs/", "config.properties");
			File file = new File(path.toString());
			FileInputStream input = new FileInputStream(file);
			config = new Properties();
			config.load(input);
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String key) {
		return config.getProperty(key);
	}

	// to check if the config object is working properly
//	public static void main(String[] args) {
//		System.out.println("*** Browser Value: " + config.get("browser"));
//		System.out.println("*** DemoBlaze: " + config.getProperty("demoblaze"));
//	}

}
