package cn.celloud.designPatterns.simpleFactory.example1;

public class Client {
	public static void main(String[] args) throws Exception {
		Caculate instance = CaculateFactory.getInstance("*");
		double result = instance.caculte(4, 0);
		System.out.println("结果是："+result);
	}
}
