package cn.celloud.designPatterns.abstractFactory.dao.example4;

public interface IUser {
	//增
	void insertInto(User user);
	//删
	void delete(int id);
	//改
	void update();
	//查
	void getUser(int id);
}
