package cn.celloud.designPatterns.singleton.example1;

public class Singleton6 {
	private Singleton6(){
		
	}
	//静态的成员内部类，与外部实例没有绑定关系，只有被调用时，才会加载，实现了延迟加载
	private static class SingletonHolder{
		//JVM保证线程安全
		private static Singleton6 singleton = new Singleton6();
	}
	public static Singleton6 getInstance(){
		return SingletonHolder.singleton;
	}
}
