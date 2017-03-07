package cn.celloud.designPatterns.abstractFactory.dao.example4;

public class OracelUser implements IUser {

	@Override
	public void insertInto(User user) {
		System.out.println("oracle insert user.......");
	}

	@Override
	public void delete(int id) {
		System.out.println("oracle delete user.......");
	}

	@Override
	public void update() {
		System.out.println("oracle update user.......");
	}

	@Override
	public void getUser(int id) {
		System.out.println("oracle getUser user.......");
	}

}
