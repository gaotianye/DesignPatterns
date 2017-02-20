package cn.celloud.designPatterns.adapter.example2;
/**
 * 翻译
 * 不改动双方代码的前提下，进行翻译
 * @author Administrator
 *
 */
public class Translate {
	//服务对象
	private ForeignForward f ;
	
	public Translate(ForeignForward f) {
		super();
		this.f = f;
	}
	
	public void attack() {
		f.jingong();
	}

	public void defense() {
		f.fangshou();
	}
}
