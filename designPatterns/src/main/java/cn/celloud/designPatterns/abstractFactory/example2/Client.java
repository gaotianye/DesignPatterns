package cn.celloud.designPatterns.abstractFactory.example2;

public class Client {
	public static void main(String[] args) {
		ConcreteFactory1 concreteFactory1 = new ConcreteFactory1();
		AbstractProductA createProductA = concreteFactory1.createProductA();
		AbstractProductB createProductB = concreteFactory1.createProductB();
		createProductA.aCount();
		createProductB.bCount();
	}
}
