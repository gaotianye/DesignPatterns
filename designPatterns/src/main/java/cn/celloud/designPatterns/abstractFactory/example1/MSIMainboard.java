package cn.celloud.designPatterns.abstractFactory.example1;

public class MSIMainboard implements MainboardApi {
	/**
	 * CPU的插槽的孔数
	 */
	private int cpuHoles = 0;
	
	public MSIMainboard(int cpuHoles) {
		super();
		this.cpuHoles = cpuHoles;
	}

	@Override
	public void installCPU() {
		System.out.println("now in MSIMainboard,cpuHoles="+cpuHoles);
	}

}
