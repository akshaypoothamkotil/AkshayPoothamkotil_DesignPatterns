package creationalFactoryPattern;

public class GameFactoryDemo {

	public static void main(String args[]) {
		GameFactory gameFactory=new GameFactory();
		Game game1=gameFactory.getGame("FPS");
		Game game2=gameFactory.getGame("MOBA");
		Game game3=gameFactory.getGame("Racing");
		game1.play();
		game2.play();
		game3.play();
	}
	
}
