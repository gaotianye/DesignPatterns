package cn.celloud.designPatterns.builder.example1;
/**
 * 生成器接口，定义创建一个产品对象所需的各个部件的操作
 * @author Administrator
 *
 */
public interface Builder {
	//构建部件1
	void buildPart1();
	//构建部件2
	void buildPart2();
	//构建部件3
	void buildPart3();
}
