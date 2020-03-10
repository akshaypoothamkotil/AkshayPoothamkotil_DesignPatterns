package creationalFactoryPattern;

public class GameFactory {

	public Game getGame(String gameType) {
		   if(gameType == null){
		         return null;
		      }		
		      if(gameType.equalsIgnoreCase("FPS")){
		         return new FPS();
		         
		      } else if(gameType.equalsIgnoreCase("MOBA")){
		         return new MOBA();
		         
		      } else if(gameType.equalsIgnoreCase("Racing")){
		         return new Racing();
		      }
		      
		      return null;
	}
	
}
