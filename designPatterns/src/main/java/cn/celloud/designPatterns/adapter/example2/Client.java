package cn.celloud.designPatterns.adapter.example2;

public class Client {
	public static void main(String[] args) {
		//原始
		Forward forward = new Forward("gaotianye");
		forward.attack();
		forward.defense();
		System.out.println("----------");
		//带翻译的
		ForeignForward foreignForward = new ForeignForward("高天野");
		Translate translate = new Translate(foreignForward);
		translate.attack();
		translate.defense();
	}
}
