package cn.celloud.designPatterns.simpleFactory.example1;
/**
 * 简单工厂模式
 * 计算工厂
 * jdk1.7版本
 * @author Administrator
 *
 */
public class CaculateFactory {
	//首先，将工厂设定成工具类，不让外部创建
	private CaculateFactory(){
		
	}
	
	public static Caculate getInstance(String sign) throws Exception{
		Caculate c = null;
		switch (sign) {
		case "+":
			c = new AddCaculate();
			break;
		case "-":
			c = new SubtractCaculate();
			break;
		case "*":
			c = new MultiplyCaculate();
			break;
		case "/":
			c = new DivideCaculate();
			break;
		default:
			throw new Exception("请输入正确的符号!");
		}
		return c;
	}
}
