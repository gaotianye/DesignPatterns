package cn.celloud.designPatterns.abstractFactory.dao.example3;

public abstract class AbstractFactory {
	//创建User对象
	public abstract IUser createUser();
	//创建Department对象
	public abstract IDepartment createDepartment();
}
