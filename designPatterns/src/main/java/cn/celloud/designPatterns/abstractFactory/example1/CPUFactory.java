package cn.celloud.designPatterns.abstractFactory.example1;

public class CPUFactory {
	public static CPUApi createCPUApi(int type){
		CPUApi cpu = null;
		switch(type){
			case 1:
				cpu = new IntelCPU(1156);
				break;
			case 2:
				cpu = new AMDCPU(939);
				break;
		}
		return cpu;
	}
}
