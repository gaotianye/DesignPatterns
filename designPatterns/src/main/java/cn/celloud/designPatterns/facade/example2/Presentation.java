package cn.celloud.designPatterns.facade.example2;
/**
 * 生成表现层
 * @author Administrator
 *
 */
public class Presentation {
	public void generate(){
		//获取配置信息
		ConfigModel model = ConfigManager.getInstance().getModel();
		if(model.isNeedGenPresentation()){
			System.out.println("表现层正在生成中....");
		}
	}
}
