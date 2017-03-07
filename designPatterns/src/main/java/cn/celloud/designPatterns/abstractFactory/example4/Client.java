package cn.celloud.designPatterns.abstractFactory.example4;

public class Client {
	public static void main(String[] args) {
		SqlserverUser sqlserver = new SqlserverUser();
		sqlserver.insert(new User("gaotianye",1));
		sqlserver.getUser(1);
	}
}
