package cn.celloud.designPatterns.adapter.example2;

public class Forward extends Player {
	
	public Forward(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println(name+" attack.........");
	}

	@Override
	public void defense() {
		System.out.println(name+" defense.........");
	}

}
