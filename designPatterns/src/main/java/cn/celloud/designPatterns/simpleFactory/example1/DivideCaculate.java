package cn.celloud.designPatterns.simpleFactory.example1;

public class DivideCaculate implements Caculate {

	@Override
	public double caculte(double a, double b) throws Exception {
		if(b!=0){
			return a/b;
		}
		throw new Exception("0不能作为被除数!");
	}
}
