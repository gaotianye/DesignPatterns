package cn.celloud.designPatterns.factoryMethod.example3;
/**
 * 硬盘功能
 * @author Administrator
 *
 */
public interface HDOperate {
	//获取数据
	String getData();
	//存储数据
	void setData(String data);
}
