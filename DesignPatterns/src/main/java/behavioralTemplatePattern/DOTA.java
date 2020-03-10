package behavioralTemplatePattern;

public class DOTA extends Game{

	@Override
	void initialize() {
		System.out.println("DOTA Initialized to play!!\n");
	}

	@Override
	void startPlay() {
		System.out.println("DOTA game Started\n");
	}

	@Override
	void endPlay() {
		System.out.println("DOTA game ended\n");
	}

}
