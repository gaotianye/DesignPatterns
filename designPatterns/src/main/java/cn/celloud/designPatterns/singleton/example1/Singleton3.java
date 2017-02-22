package cn.celloud.designPatterns.singleton.example1;
/**
 * 懒汉式，解决了线程不安全问题。
 * 但是：非常耗时。因为每次调用getInstance时，很有可能发现外部被锁住了
 * @author Administrator
 *
 */
public class Singleton3 {
	private static Singleton3 singleton = null;
	private Singleton3(){
		
	}
	public synchronized static Singleton3 getInstance(){
		if(singleton == null){
			singleton = new Singleton3();
		}
		return singleton;
	}
}
