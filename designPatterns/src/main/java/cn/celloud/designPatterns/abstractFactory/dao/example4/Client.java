package cn.celloud.designPatterns.abstractFactory.dao.example4;

public class Client {
	public static void main(String[] args) {
		IUser user = DataFactory.createUser("oracle");
		user.insertInto(new User("gaotianye",2));
		user.delete(2);
		user.getUser(3);
		user.update();
		System.out.println("=========");
		IDepartment dep = DataFactory.createDepartment("sqlserver");
		dep.delete(2);
	}
}
