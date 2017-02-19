package cn.celloud.designPatterns.facade.example1;
/**
 * 股票0001
 * @author Administrator
 *
 */
public class Shares0001 implements Invest {

	@Override
	public void sell() {
		System.out.println("卖掉股票0001");
	}

	@Override
	public void buy() {
		System.out.println("购买股票0001");
	}

}
