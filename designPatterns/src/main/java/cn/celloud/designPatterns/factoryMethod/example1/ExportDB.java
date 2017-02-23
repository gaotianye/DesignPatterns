package cn.celloud.designPatterns.factoryMethod.example1;
/**
 * 导出成数据库格式的文件
 * @author Administrator
 *
 */
public class ExportDB implements ExportFileApi {

	@Override
	public boolean export(String data) {
		System.out.println("导出的数据是："+data);
		System.out.println("导出成数据库格式的文件");
		return true;
	}

}
