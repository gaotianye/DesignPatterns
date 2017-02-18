package cn.celloud.designPatterns.simpleFactory.example2;

public class Client {
	public static void main(String[] args) throws Exception {
		//classname配置文件
		Caculate c_instance = CaculateFactory.getClassNameInstance();
		double result = c_instance.caculte(4, 0);
		System.out.println("结果是："+result);
		
		//operate配置文件
		Caculate o_instance = CaculateFactory.getOperateInstance();
		double result2 = o_instance.caculte(1, 9);
		System.out.println("结果是："+result2);
	}
}
