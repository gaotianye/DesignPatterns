package cn.celloud.designPatterns.facade.example2;
/**
 * 外观
 * @author Administrator
 *
 */
public class Facade {
	public void generate(){
		new Presentation().generate();
		new DAO().generate();
		new Business().generate();
	}
}
