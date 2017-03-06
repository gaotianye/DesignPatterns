package cn.celloud.designPatterns.abstractFactory.example3;

public class Schema1 implements AbstractFactory {

	@Override
	public CPUApi createCPUApi() {
		return new IntelCPU(1156);
	}

	@Override
	public MainboardApi createMainboardApi() {
		return new GAMainboard(1156);
	}

}
