package cn.celloud.designPatterns.factoryMethod.example3;

public class BijibenHardDisk extends HardDisk {

	@Override
	protected HDOperate createHDOperate() {
		return new BijibenOperate();
	}

}
