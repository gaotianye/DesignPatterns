package cn.celloud.designPatterns.simpleFactory.example1;

public class MultiplyCaculate implements Caculate {

	@Override
	public double caculte(double a, double b) {
		return a * b;
	}

}
