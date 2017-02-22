package cn.celloud.designPatterns.singleton.example1;
/**
 * 饿汉式，虚拟机保证了线程安全的
 * @author Administrator
 *
 */
public class Singleton1 {
	private static Singleton1 singleton = new Singleton1();
	
	private Singleton1(){
		
	}
	public static Singleton1 getInstance(){
		return singleton;
	}
}
