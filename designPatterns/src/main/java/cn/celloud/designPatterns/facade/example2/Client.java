package cn.celloud.designPatterns.facade.example2;

public class Client {
	public static void main(String[] args) {
		Facade f = new Facade();
		f.generate();
	}
}
