package cn.celloud.designPatterns.abstractFactory.example3;

public class ComputeEngineer {
	private CPUApi cpu = null;
	private MainboardApi mainboard = null;
	//对外的
	public void makeCompute(AbstractFactory schema){
		//组装机器
		prepareHardwares(schema);
	}
	//不对外的
	private void prepareHardwares(AbstractFactory schema) {
		this.cpu = schema.createCPUApi();
		this.mainboard = schema.createMainboardApi();
		this.cpu.caculate();
		this.mainboard.installCPU();
	}
}
