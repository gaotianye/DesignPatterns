package cn.celloud.designPatterns.singleton.example1;
/**
 * 懒汉式：线程不安全
 * @author Administrator
 *
 */
public class Singleton2 {
	private static Singleton2 singleton = null;
	
	private Singleton2(){
		
	}
	
	public static Singleton2 getInstance(){
		if(singleton==null){
			singleton = new Singleton2();
		}
		return singleton;
	}
}