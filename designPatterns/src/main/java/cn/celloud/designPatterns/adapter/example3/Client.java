package cn.celloud.designPatterns.adapter.example3;
/**
 * 适配器代码中，我们可以传入要适配的对象，或者干脆就不传。
 * 此版本中我们就没有传入。
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		Target target = new Target();
		target.add();
		target.delete();
		target.update();
		target.find();
	}
}
