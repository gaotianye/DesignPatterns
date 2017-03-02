package cn.celloud.designPatterns.factoryMethod.example3;
/**
 * HardDisk:硬盘
 * @author Administrator
 *
 */
public abstract class HardDisk {
	//创建HD操作对象
	protected abstract HDOperate createHDOperate();
}
