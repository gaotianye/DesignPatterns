package cn.celloud.designPatterns.abstractFactory.example1;

public class ComputeEngineer {
	private CPUApi cpu = null;
	private MainboardApi mainboard = null;
	//对外的
	public void makeCompute(int cpuType,int mainboardType){
		//组装机器
		prepareHardwares(cpuType,mainboardType);
	}
	//不对外的
	private void prepareHardwares(int cpuType, int mainboardType) {
		this.cpu = CPUFactory.createCPUApi(cpuType);
		this.mainboard = MainBoardFactory.createMainboardApi(mainboardType);
		this.cpu.caculate();
		this.mainboard.installCPU();
	}
}
