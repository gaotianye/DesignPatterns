package cn.celloud.designPatterns.adapter.example2;

public abstract class Player {
	protected String name;

	public Player(String name) {
		super();
		this.name = name;
	}
	//进攻
	public abstract void attack();
	//防守
	public abstract void defense();
}
