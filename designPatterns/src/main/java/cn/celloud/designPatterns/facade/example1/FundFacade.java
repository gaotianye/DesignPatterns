package cn.celloud.designPatterns.facade.example1;
/**
 * 基金：外观模式
 * @author Administrator
 *
 */
public class FundFacade {
	private NationalDebt2016 netional_debt_2016 = new NationalDebt2016();
	private Realty12345 realty_12345 = new Realty12345();
	private Shares0001 shares0001 = new Shares0001();
	private Shares0002 shares0002 = new Shares0002();
	
	//购买基金
	void BuyFund(){
		netional_debt_2016.buy();
		realty_12345.buy();
		shares0001.buy();
		shares0002.buy();
	}
	
	//赎回基金
	void SellFund(){
		netional_debt_2016.sell();
		realty_12345.sell();
		shares0001.sell();
		shares0002.sell();
	}
}
