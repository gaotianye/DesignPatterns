package cn.celloud.designPatterns.abstractFactory.example2;
/**
 * 抽象工厂
 * @author Administrator
 *
 */
public interface AbstractFactory {
	//创建抽象产品A
	public AbstractProductA createProductA();
	//创建抽象产品B
	public AbstractProductB createProductB();
}
