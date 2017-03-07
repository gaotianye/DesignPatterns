package cn.celloud.designPatterns.abstractFactory.dao.example2;


public class Client {
	public static void main(String[] args) {
		SqlDaoFactory factory = new SqlDaoFactory();
		SqlUser sqlUser = factory.createSqlUser("oracle");
		sqlUser.insert(new User("gaotianye",2));
		sqlUser.delete(2);
		sqlUser.update(new User("wangyanzhong",3));
		sqlUser.getUser(3);
	}
}
