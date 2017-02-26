package cn.celloud.designPatterns.factoryMethod.example3;

public class TaishijiOperate implements HDOperate {

	@Override
	public String getData() {
		return "taishiji data.......";
	}

	@Override
	public void setData(String data) {
		System.out.println("taishiji data is :"+data);
	}

}
