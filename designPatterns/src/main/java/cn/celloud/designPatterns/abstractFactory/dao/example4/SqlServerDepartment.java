package cn.celloud.designPatterns.abstractFactory.dao.example4;

public class SqlServerDepartment implements IDepartment {

	@Override
	public void insertInto(Department department) {
		System.out.println("sqlServer insert department......");
	}

	@Override
	public void delete(int id) {
		System.out.println("sqlServer delete department......");
	}

}
