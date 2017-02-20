package cn.celloud.designPatterns.adapter.example2;
/**
 * 外籍不太懂英语。只知道jingong和fangshou
 * @author Administrator
 *
 */
public class ForeignForward {
	
	private String name;
	
	public ForeignForward(String name) {
		this.name = name;
	}

	public void jingong() {
		System.out.println(name + " 进攻........");
	}

	public void fangshou() {
		System.out.println(name + " 防守..........");
	}

}
