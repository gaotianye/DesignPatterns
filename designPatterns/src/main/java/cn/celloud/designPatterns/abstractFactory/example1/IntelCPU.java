package cn.celloud.designPatterns.abstractFactory.example1;
/**
 * Intel的CPU
 * @author Administrator
 *
 */
public class IntelCPU implements CPUApi {
	/**
	 * CPU的针脚数目
	 */
	private int pins = 0;
	
	public IntelCPU(int pins) {
		super();
		this.pins = pins;
	}

	@Override
	public void caculate() {
		System.out.println("now in Intel CPU,pins="+pins);
	}

}
