package cn.celloud.designPatterns.factoryMethod.example1;
/**
 * 接口：功能是   导出数据
 * 具体导出什么类型的数据，由它的子类来完成
 * @author Administrator
 *
 */
public interface ExportFileApi {
	public boolean export(String data);
}
