package cn.celloud.designPatterns.simpleFactory.example2;

public class SubtractCaculate implements Caculate {

	@Override
	public double caculte(double a, double b) {
		return a - b;
	}

}
