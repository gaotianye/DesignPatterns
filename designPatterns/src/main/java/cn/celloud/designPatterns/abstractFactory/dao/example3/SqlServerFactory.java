package cn.celloud.designPatterns.abstractFactory.dao.example3;


public class SqlServerFactory extends AbstractFactory {

	@Override
	public IUser createUser() {
		return new SqlServerUser();
	}

	@Override
	public IDepartment createDepartment() {
		return new SqlServerDepartment();
	}

}
