package cn.celloud.designPatterns.facade.example2;
/**
 * 生成DAO层
 * @author Administrator
 *
 */
public class DAO {
	public void generate(){
		//获取配置信息
		ConfigModel model = ConfigManager.getInstance().getModel();
		if(model.isNeedGenDAO()){
			System.out.println("DAO层正在生成中....");
		}
	}
}
