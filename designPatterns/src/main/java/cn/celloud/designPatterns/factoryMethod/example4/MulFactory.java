package cn.celloud.designPatterns.factoryMethod.example4;

public class MulFactory extends Factory {

	@Override
	protected Operate createOperate() {
		return new MulOperate();
	}

}
