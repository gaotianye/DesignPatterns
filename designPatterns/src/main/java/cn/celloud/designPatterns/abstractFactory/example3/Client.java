package cn.celloud.designPatterns.abstractFactory.example3;

public class Client {
	public static void main(String[] args) {
		ComputeEngineer computeEngineer = new ComputeEngineer();
		computeEngineer.makeCompute(new Schema1());
		System.out.println("=======");
		computeEngineer.makeCompute(new Schema2());
	}
}
