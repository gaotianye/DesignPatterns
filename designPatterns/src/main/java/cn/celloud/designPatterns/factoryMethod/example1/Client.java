package cn.celloud.designPatterns.factoryMethod.example1;

public class Client {
	public static void main(String[] args) throws Exception {
		ExportOperator operator = new ExportOperator();
		boolean b = operator.operator("good evening....", 2);
		System.out.println("export is : "+b);
	}
}
