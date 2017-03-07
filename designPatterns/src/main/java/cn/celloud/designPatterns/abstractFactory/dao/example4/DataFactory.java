package cn.celloud.designPatterns.abstractFactory.dao.example4;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class DataFactory {
	private DataFactory(){};
	
	public static IUser createUser(String namespace){
		IUser newInstance = null;
		Properties p = new Properties();
		InputStream in = null;
		try {
			in = DataFactory.class.getResourceAsStream("db.properties");
			p.load(in);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//通过反射来获取配置文件中的参数
		try {
			newInstance = (IUser) Class.forName(p.getProperty(namespace+"_user")).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return newInstance;
	}
	
	public static IDepartment createDepartment(String namespace){
		IDepartment newInstance = null;
		Properties p = new Properties();
		InputStream in = null;
		try {
			in = DataFactory.class.getResourceAsStream("db.properties");
			p.load(in);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//通过反射来获取配置文件中的参数
		try {
			newInstance = (IDepartment) Class.forName(p.getProperty(namespace+"_department")).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return newInstance;
	}
}
