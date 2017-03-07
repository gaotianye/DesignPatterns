package cn.celloud.designPatterns.abstractFactory.dao.example2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class SqlDaoFactory extends DaoFactory {

	@Override
	public SqlUser createSqlUser(String namespace) {
		SqlUser newInstance = null;
		Properties p = new Properties();
		InputStream in = null;
		try {
			in = SqlDaoFactory.class.getResourceAsStream("db.properties");
			p.load(in);
		} catch (Exception e) {
			try {
				throw new Exception("db.properties配置文件加载错误!");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//通过反射来获取配置文件中的参数
		try {
			newInstance = (SqlUser) Class.forName(p.getProperty(namespace)).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return newInstance;
	}
}
