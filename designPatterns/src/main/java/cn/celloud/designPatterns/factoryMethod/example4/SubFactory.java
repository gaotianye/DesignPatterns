package cn.celloud.designPatterns.factoryMethod.example4;

public class SubFactory extends Factory {

	@Override
	protected Operate createOperate() {
		return new SubOperate();
	}

}
