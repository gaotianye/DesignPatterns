package cn.celloud.designPatterns.abstractFactory.dao.example2;

public abstract class DaoFactory {
	//创建连接数据库对象
	abstract SqlUser createSqlUser(String namespace);
}
