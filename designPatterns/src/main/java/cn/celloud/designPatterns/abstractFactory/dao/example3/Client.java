package cn.celloud.designPatterns.abstractFactory.dao.example3;

public class Client {
	public static void main(String[] args) {
		OracleFactory orfactory = new OracleFactory();
		IUser user = orfactory.createUser();
		user.insertInto(new User("gaotianye",1));
		user.delete(2);
		user.update();
		user.getUser(2);
		System.out.println("=========");
		SqlServerFactory sqlfactory = new SqlServerFactory();
		IDepartment department = sqlfactory.createDepartment();
		department.delete(2);
	}
}
