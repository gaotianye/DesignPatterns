package cn.celloud.designPatterns.abstractFactory.example3;

public class Schema2 implements AbstractFactory {

	@Override
	public CPUApi createCPUApi() {
		return new AMDCPU(939);
	}

	@Override
	public MainboardApi createMainboardApi() {
		return new MSIMainboard(939);
	}
	
}
