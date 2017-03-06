package cn.celloud.designPatterns.singleton.example1;

public class Client {
	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<100000;i++){
			Singleton4 instance = Singleton4.getInstance();
			Thread.sleep(10);
			System.out.println(instance.hashCode());
		}
	}
}
