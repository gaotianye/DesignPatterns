package cn.celloud.designPatterns.adapter.example1;
/**
 * 适配器代码
 * @author Administrator
 *
 */
public class Target {
	//要适配的对象
	private OldVersion oldVersion;
	//可以让client传入要执行的对象
	public Target(OldVersion oldVersion) {
		super();
		this.oldVersion = oldVersion;
	}
	//client端也可以不传入要执行的对象
	public Target() {
		super();
	}

	public void speak(){
		if(oldVersion==null){
			oldVersion = new OldVersion();
		}
		oldVersion.say();
	}
}
