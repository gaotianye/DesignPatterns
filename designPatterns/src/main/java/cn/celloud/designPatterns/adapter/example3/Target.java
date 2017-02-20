package cn.celloud.designPatterns.adapter.example3;
/**
 * find还是从文件中读取
 * add还是往文件中写
 * delete则是从数据库中删除
 * update则是修改数据库中的数据
 * @author Administrator
 *
 */
public class Target {
	private DataFile datafile = new DataFile();
	private DataBase database = new DataBase();
	
	public void add(){
		datafile.writeToFile();
	}
	public void delete(){
		database.delete();
	}
	public void update(){
		database.update();
	}
	public void find(){
		datafile.readFromFile();
	}
}
