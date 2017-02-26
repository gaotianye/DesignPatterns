package cn.celloud.designPatterns.factoryMethod.example3;

public class BijibenOperate implements HDOperate {

	@Override
	public String getData() {
		return "bijiben data......";
	}

	@Override
	public void setData(String data) {
		System.out.println("bijiben data is :"+data);
	}

}
