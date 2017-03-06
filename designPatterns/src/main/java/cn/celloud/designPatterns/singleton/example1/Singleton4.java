package cn.celloud.designPatterns.singleton.example1;
/**
 * 双重检查加锁：线程安全且速度比以前单重检查要快。
 * 懒汉式
 * 这是一个错误的优化：
 * 第1个线程：读取到instance不为null时，进入锁，然后继续判断instance不为null，创建实例对象，释放锁
 * 第2个线程：读到if(singleton == null)，instance引用的对象还没有完成初始化，前面已经释放锁，
 * 这个线程进入锁，再读if(singleton == null)，由于JVM等优化，可能会出现虽然已经释放锁，但是有可能
 * 实例对象还没有创建成功。于是又创建了一次对象。
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
