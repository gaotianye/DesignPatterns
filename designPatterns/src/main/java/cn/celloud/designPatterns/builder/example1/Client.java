package cn.celloud.designPatterns.builder.example1;

public class Client {
	public static void main(String[] args) {
		TextBuilder builder = new TextBuilder();
		Director director = new Director(builder);
		director.construct();
	}
}
