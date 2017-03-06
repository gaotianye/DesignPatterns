package cn.celloud.designPatterns.abstractFactory.example3;

public interface AbstractFactory {
	public CPUApi createCPUApi();
	public MainboardApi createMainboardApi();
}
