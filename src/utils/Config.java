package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {
	private String file = null;
	private Properties cfg = null;
	/**
	 * 解析配置文件
	 * @param file
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public Config(String file) throws FileNotFoundException, IOException{
		this.file = file;
		cfg = new Properties();
		cfg.load(new FileInputStream(file));
	}
	public String getString(String key){
		return cfg.getProperty(key);
	}
	public int getInt(String key){
		return Integer.parseInt(cfg.getProperty(key));
	}
	public Double getDouble(String key){
		return Double.parseDouble(getString(key));
	}
}
