package cn.celloud.designPatterns.factoryMethod.example3;

public class Client {
	public static void main(String[] args) {
		TaishijiHardDisk taishijiHardDisk = new TaishijiHardDisk();
		BijibenHardDisk bijibenHardDisk = new BijibenHardDisk();
		HDOperate bijiben = bijibenHardDisk.createHDOperate();
		HDOperate taishi = taishijiHardDisk.createHDOperate();
		taishi.setData("gaotianye");
		String data = taishi.getData();
		System.out.println(data);
		System.out.println("=========");
		bijiben.setData("yuwei");
		String data2 = bijiben.getData();
		System.out.println(data2);
	}
}
