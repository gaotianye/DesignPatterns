package cn.celloud.designPatterns.abstractFactory.example1;

public class Client {
	public static void main(String[] args) {
		ComputeEngineer engineer = new ComputeEngineer();
		engineer.makeCompute(1, 2);
	}
}
