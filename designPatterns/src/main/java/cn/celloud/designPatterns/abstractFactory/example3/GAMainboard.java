package cn.celloud.designPatterns.abstractFactory.example3;

public class GAMainboard implements MainboardApi{
	/**
	 * CPU的插槽的孔数
	 */
	private int cpuHoles = 0;
	
	public GAMainboard(int cpuHoles) {
		super();
		this.cpuHoles = cpuHoles;
	}

	@Override
	public void installCPU() {
		System.out.println("now in GAMainboard,cpuHoles="+cpuHoles);
	}

}
