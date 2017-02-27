package cn.celloud.designPatterns.factoryMethod.example4;

public class MulOperate implements Operate {

	@Override
	public double getResult(double a, double b) {
		return a * b;
	}

}
