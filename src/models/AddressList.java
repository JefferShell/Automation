package models;

import java.io.IOException;

import utils.Config;
import exception.ReadAdressException;

public class AddressList {
	private String dataPath = "address.txt";
	private Config config = null;
	public AddressList() throws ReadAdressException{
		try {
			config = new Config(dataPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ReadAdressException("获取地址失败");
		}
	}
	public AddressList(String Path) throws ReadAdressException{
		try {
			config = new Config(Path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ReadAdressException("�获取地址失败");
		}
	}
	public String getAdressByName(String addressName){
		return config.getString(addressName);
	}
	public static void main(String[] args) {
		try {
			System.out.println(new AddressList().getAdressByName("beijing"));
		} catch (ReadAdressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
