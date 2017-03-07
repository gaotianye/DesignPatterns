package cn.celloud.designPatterns.abstractFactory.dao.example2;

public interface SqlUser {
	//增
	void insert(User user);
	//删
	boolean delete(int id);
	//改
	User update(User user);
	//查
	User getUser(int id);
}
