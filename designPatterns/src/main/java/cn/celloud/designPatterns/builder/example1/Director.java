package cn.celloud.designPatterns.builder.example1;
/**
 * 指导者，指导使用生成器的接口（Builder）来构建产品对象
 * @author Administrator
 *
 */
public class Director {
	private Builder builder;

	public Director(Builder builder) {
		super();
		this.builder = builder;
	}
	//指导生成器接口来构建最终的产品对象
	public void construct(){
		builder.buildPart1();
		builder.buildPart2();
		builder.buildPart3();
	}
}
