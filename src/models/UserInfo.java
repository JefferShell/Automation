package models;

import java.io.IOException;

import utils.Config;
import exception.ReadDatasException;

public class UserInfo {
	private String dataPath = "./dataResource/userInfo.txt";
	private Config config = null;
	public UserInfo() throws ReadDatasException{
		try {
			config = new Config(dataPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ReadDatasException("读取账号信息失败");
		}
	}
	public UserInfo(String path) throws ReadDatasException{
		try {
			config = new Config(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ReadDatasException("读取账号信息失败");
		}
	}
	public String getUserName(){
		return config.getString("userName");
	}
	public String getPwd(){
		return config.getString("pwd");
	}

}
