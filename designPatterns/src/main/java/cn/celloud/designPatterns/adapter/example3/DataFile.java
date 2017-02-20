package cn.celloud.designPatterns.adapter.example3;
/**
 * 系统的第一版本：数据存储在文件中
 * @author Administrator
 *
 */
public class DataFile {
	public void writeToFile(){
		System.out.println("file......输入写入文件中");
	}
	
	public void readFromFile(){
		System.out.println("file......从文件中读取数据");
	}
}
