package cn.celloud.designPatterns.facade.example1;
/**
 * 2016国债
 * @author Administrator
 *
 */
public class NationalDebt2016 implements Invest {

	@Override
	public void sell() {
		System.out.println("卖掉2016国债");
	}

	@Override
	public void buy() {
		System.out.println("购买2016国债");
	}

}
