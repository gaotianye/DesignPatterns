package cn.celloud.designPatterns.factoryMethod.example2;

public class Creator2 extends Creator {

	@Override
	protected Product factoryMethod() {
		return new ProductFun2();
	}

}
