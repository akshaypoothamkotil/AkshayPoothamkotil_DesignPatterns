package behavioralTemplatePattern;

public class PlayGame {
public static void main(String [] args) {
	
	Game game= new CSGO();
	game.play();
	
	
	game=new DOTA();
	game.play();
	
	
}
}
