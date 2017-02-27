package cn.celloud.designPatterns.factoryMethod.example4;

public class AddFactory extends Factory {

	@Override
	protected Operate createOperate() {
		return new AddOperate();
	}

}
