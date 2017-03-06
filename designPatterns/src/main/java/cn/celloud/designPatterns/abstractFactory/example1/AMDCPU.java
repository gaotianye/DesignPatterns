package cn.celloud.designPatterns.abstractFactory.example1;

public class AMDCPU implements CPUApi {
	/**
	 * CPU的针脚数目
	 */
	private int pins = 0;
	
	public AMDCPU(int pins) {
		super();
		this.pins = pins;
	}

	@Override
	public void caculate() {
		System.out.println("now in AMD CPU,pins="+pins);
	}

}
