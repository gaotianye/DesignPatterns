package cn.celloud.designPatterns.singleton.example1;

public class Client {
	public static void main(String[] args) {
		for(int i=0;i<100;i++){
			Singleton2 instance = Singleton2.getInstance();
			System.out.println(instance.hashCode());
		}
	}
}
