package cn.celloud.designPatterns.facade.example1;
/**
 * 12345号房地产
 * @author Administrator
 *
 */
public class Realty12345 implements Invest {

	@Override
	public void sell() {
		System.out.println("卖掉12345号房产");
	}

	@Override
	public void buy() {
		System.out.println("购买12345号房产");
	}

}
