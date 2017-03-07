package cn.celloud.designPatterns.abstractFactory.dao.example3;

public class OracleDepartment implements IDepartment {

	@Override
	public void insertInto(Department department) {
		System.out.println("oracle insert department......");
	}

	@Override
	public void delete(int id) {
		System.out.println("oracle delete department......");
	}

}
