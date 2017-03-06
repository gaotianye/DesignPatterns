package cn.celloud.designPatterns.abstractFactory.example1;

public class MainBoardFactory {
	public static MainboardApi createMainboardApi(int type){
		MainboardApi mainboard = null;
		switch(type){
			case 1:
				mainboard = new GAMainboard(1156);
				break;
			case 2:
				mainboard = new MSIMainboard(939);
		}
		return mainboard;
	}
}
