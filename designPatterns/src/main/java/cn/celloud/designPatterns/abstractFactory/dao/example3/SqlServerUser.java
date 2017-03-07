package cn.celloud.designPatterns.abstractFactory.dao.example3;

public class SqlServerUser implements IUser {

	@Override
	public void insertInto(User user) {
		System.out.println("sqlServer insert user.......");
	}

	@Override
	public void delete(int id) {
		System.out.println("sqlServer delete  user.......");
	}

	@Override
	public void update() {
		System.out.println("sqlServer update user.......");
	}

	@Override
	public void getUser(int id) {
		System.out.println("sqlServer getUser user.......");
	}

}
