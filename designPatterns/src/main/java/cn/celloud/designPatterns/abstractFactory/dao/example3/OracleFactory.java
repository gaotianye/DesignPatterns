package cn.celloud.designPatterns.abstractFactory.dao.example3;

public class OracleFactory extends AbstractFactory {

	@Override
	public IUser createUser() {
		return new OracelUser();
	}

	@Override
	public IDepartment createDepartment() {
		return new OracleDepartment();
	}

}
