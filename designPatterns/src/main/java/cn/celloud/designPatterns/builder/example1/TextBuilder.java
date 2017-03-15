package cn.celloud.designPatterns.builder.example1;

public class TextBuilder implements Builder {
	private Product product;
	/**
	 * 将各个部分组成产品
	 * @return
	 */
	public Product getProduct(){
		return product;
	}
	
	@Override
	public void buildPart1() {
		System.out.println("text part1........");
	}

	@Override
	public void buildPart2() {
		System.out.println("text part2........");
	}

	@Override
	public void buildPart3() {
		System.out.println("text part3........");
	}
}
