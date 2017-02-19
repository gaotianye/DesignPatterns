package cn.celloud.designPatterns.facade.example2;
/**
 * 生成业务层
 * @author Administrator
 *
 */
public class Business {
	public void generate(){
		//获取配置信息
		ConfigModel model = ConfigManager.getInstance().getModel();
		if(model.isNeedGenBusiness()){
			System.out.println("业务层正在生成中....");
		}
	}
}
