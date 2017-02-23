package cn.celloud.designPatterns.factoryMethod.example1;
/**
 * export执行类
 * @author Administrator
 *
 */
public class ExportOperator {
	public boolean operator(String data,int code) throws Exception{
		ExportFileApi api = null;
		switch (code) {
		case 1:
			api = new ExportExcel();
			break;
		case 2:
			api = new ExportDB();
			break;
		default:
			throw new Exception("输入正确的编号！");
		}
		return api.export(data);
	}
}
