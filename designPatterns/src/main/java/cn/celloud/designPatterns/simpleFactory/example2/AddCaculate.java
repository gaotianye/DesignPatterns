package cn.celloud.designPatterns.simpleFactory.example2;

public class AddCaculate implements Caculate {

	@Override
	public double caculte(double a, double b) {
		return a + b;
	}
}
