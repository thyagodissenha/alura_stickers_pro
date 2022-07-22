package br.com.alura_sticker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigApp {
	
	public static String getProperties(String propertie) throws IOException {
		Properties config = new Properties();
		FileInputStream arquivo = new FileInputStream("../alura_sticker/src/main/resources/config.properties");
		config.load(arquivo);
		return config.getProperty(propertie);
	}
}