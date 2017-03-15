package cn.celloud.designPatterns.builder.example1;

public class XmlBuilder implements Builder {
	private Product product;
	
	public Product getProduct(){
		return product;
	}
	
	@Override
	public void buildPart1() {
		System.out.println("xml part1........");
	}

	@Override
	public void buildPart2() {
		System.out.println("xml part2........");
	}

	@Override
	public void buildPart3() {
		System.out.println("xml part3........");
	}
}
