package cn.celloud.designPatterns.simpleFactory.example2;

import java.io.InputStream;
import java.util.Properties;

import cn.celloud.designPatterns.simpleFactory.example2.AddCaculate;
import cn.celloud.designPatterns.simpleFactory.example2.DivideCaculate;
import cn.celloud.designPatterns.simpleFactory.example2.MultiplyCaculate;
import cn.celloud.designPatterns.simpleFactory.example2.SubtractCaculate;

/**
 * 简单工厂模式
 * 计算工厂
 * 通过反射方式（读取配置文件中的信息）
 * @author Administrator
 *
 */
public class CaculateFactory {
	//首先，将工厂设定成工具类，不让外部创建
	private CaculateFactory(){
		
	}
	
	/**
	 * 配置文件中：value值是对应的Class的全类名
	 * 配置文件名称为：classname.properties
	 * @return
	 * @throws Exception
	 */
	public static Caculate getClassNameInstance() throws Exception{
		Caculate c = null;
		Properties p = new Properties();
		InputStream in = null;
		try {
			in = CaculateFactory.class.getResourceAsStream("classname.properties");
			p.load(in);
		} catch (Exception e) {
			throw new Exception("classname.properties配置文件加载错误!");
		} finally {
			in.close();
		}
		//通过反射来获取配置文件中的参数
		c = (Caculate) Class.forName(p.getProperty("classname")).newInstance();
		return c;
	}
	/**
	 * 配置文件中：value值是字符串类型的操作符
	 * 配置文件名称为：operate.properties
	 * @return
	 * @throws Exception
	 */
	public static Caculate getOperateInstance() throws Exception{
		Caculate c = null;
		Properties p = new Properties();
		InputStream in = null;
		try {
			in = CaculateFactory.class.getResourceAsStream("operate.properties");
			p.load(in);
		} catch (Exception e) {
			throw new Exception("operate.properties配置文件加载错误!");
		} finally {
			in.close();
		}
		//通过反射来获取配置文件中的参数
		String operate = p.getProperty("operate");
		switch (operate) {
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
			throw new Exception("请查看operate.properties配置文件中符号是否正确!");
		}
		return c;
	}
}
