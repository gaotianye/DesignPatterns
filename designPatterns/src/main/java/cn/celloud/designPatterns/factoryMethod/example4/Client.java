package cn.celloud.designPatterns.factoryMethod.example4;

public class Client {
	public static void main(String[] args) {
		DivFactory divFactory = new DivFactory();
		Operate operate = divFactory.createOperate();
		double result = operate.getResult(12, 2);
		System.out.println(result);
	}
}
