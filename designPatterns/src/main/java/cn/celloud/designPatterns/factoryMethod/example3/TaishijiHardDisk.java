package cn.celloud.designPatterns.factoryMethod.example3;

public class TaishijiHardDisk extends HardDisk {

	@Override
	protected HDOperate createHDOperate() {
		return new TaishijiOperate();
	}

}
