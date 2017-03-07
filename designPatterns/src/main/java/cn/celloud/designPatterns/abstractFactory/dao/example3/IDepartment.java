package cn.celloud.designPatterns.abstractFactory.dao.example3;

public interface IDepartment {
	//增
	void insertInto(Department department);
	//删
	void delete(int id);
}
