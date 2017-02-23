package cn.celloud.designPatterns.factoryMethod.example2;

public abstract class Creator {
	/*
	 * 不知道怎么去创建Product，但是知道需要Product对象。
	 * 于是干脆就让子类去创建吧。
	 */
	protected abstract Product factoryMethod();
	//java是后期绑定，即在运行期间能够获取到值
	public void otherMethod(){
		Product product = factoryMethod();
		product.fun();
	}
}
