package cn.celloud.designPatterns.facade.example1;

public class Client {
	public static void main(String[] args) {
		FundFacade fund = new FundFacade();
		fund.BuyFund();
		System.out.println("==========");
		fund.SellFund();
	}
}
