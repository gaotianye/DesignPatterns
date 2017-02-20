package cn.celloud.designPatterns.adapter.example1;
/**
 * client端只想调用speak方法，而不是say方法。
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		Target target = new Target();
		target.speak();
	}
}
