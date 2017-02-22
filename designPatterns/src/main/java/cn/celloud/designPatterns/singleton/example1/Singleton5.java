package cn.celloud.designPatterns.singleton.example1;

public class Singleton5 {
	private Singleton5(){
		
	}
	private volatile static Singleton5 singleton = null;
	
	public static Singleton5 getInstance(){
		if(singleton == null){
			synchronized (Singleton5.class) {
				if(singleton == null){
					singleton = new Singleton5();
				}
			}
		}
		return singleton;
	}
}
