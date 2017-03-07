package cn.celloud.designPatterns.abstractFactory.dao.example2;

public class OracleUser implements SqlUser {

	@Override
	public void insert(User user) {
		System.out.println("Oracle中给user表插入一条记录");
	}

	@Override
	public User getUser(int id) {
		System.out.println("在Oracle中根据id查询user表");
		return null;
	}

	@Override
	public boolean delete(int id) {
		System.out.println("在Oracle中已删除id编号为"+id+"的User");
		return true;
	}

	@Override
	public User update(User user) {
		System.out.println("在Oracle中更新成功");
		return null;
	}
}
