package cn.celloud.designPatterns.singleton.example1;
/**
 * 双重检查加锁：线程安全且速度比以前单重检查要快。
 * 懒汉式
 * 这是一个错误的优化：当读取到instance不为null时，
 * 	if(singleton == null)
 * instance引用的对象有可能还没有完成初始化。
 * 
 * @author Administrator
 *
 */
public class Singleton4 {
	private Singleton4(){
		
	}
	private static Singleton4 singleton = null;
	
	public static Singleton4 getInstance(){
		if(singleton == null){
			synchronized (Singleton4.class) {
				if(singleton == null){
					singleton = new Singleton4();
				}
			}
		}
		return singleton;
	}
}
