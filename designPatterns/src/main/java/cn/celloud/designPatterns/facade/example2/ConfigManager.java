package cn.celloud.designPatterns.facade.example2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class ConfigManager {
	private static ConfigModel model = null;
	private static ConfigManager manager = null;

	// 单例设计模式
	private ConfigManager() {

	}
	
	//获取manager实例
	public static ConfigManager getInstance() {
		if (manager == null) {
			manager = new ConfigManager();
		}
		// 读取配置文件
		Properties p = new Properties();
		InputStream in = null;
		in = ConfigManager.class.getResourceAsStream("configManager.properties");
		try {
			p.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		boolean presentation = Boolean.parseBoolean(p.getProperty("needGenPresentation"));
		boolean business = Boolean.parseBoolean(p.getProperty("needGenBusiness"));
		boolean dao = Boolean.parseBoolean(p.getProperty("needGenDAO"));
		//封装model对象
		model = new ConfigModel();
		model.setNeedGenBusiness(business);
		model.setNeedGenDAO(dao);
		model.setNeedGenPresentation(presentation);
		return manager;
	}
	
	//获取model实例
	public ConfigModel getModel(){
		return model;
	}
}
