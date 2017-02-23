package cn.celloud.designPatterns.factoryMethod.example2;

public class Creator1 extends Creator {

	@Override
	protected Product factoryMethod() {
		return new ProducetFun1();
	}

}
