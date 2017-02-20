package cn.celloud.designPatterns.adapter.example3;
/**
 * 系统第二版本：数据存储到数据库中
 * @author Administrator
 *
 */
public class DataBase {
	public void add(){
		System.out.println("database........往数据库中插入数据");
	}
	public void delete(){
		System.out.println("database........从数据库中删除数据");
	}
	public void update(){
		System.out.println("database........修改数据库中的数据");
	}
	public void find(){
		System.out.println("database........从数据库中查找数据");
	}
}
