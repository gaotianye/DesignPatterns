package cn.celloud.designPatterns.abstractFactory.dao.example1;

public class SqlserverUser {
	public void insert(User user){
		System.out.println("Sqlserver中给user表插入一条记录");
	}
	public User getUser(int id){
		System.out.println("在SqlServer中根据id查询user表");
		return null;
	}
}
