package cn.celloud.designPatterns.factoryMethod.example4;

public class DivFactory extends Factory {

	@Override
	protected Operate createOperate() {
		return new DivOperate();
	}

}
