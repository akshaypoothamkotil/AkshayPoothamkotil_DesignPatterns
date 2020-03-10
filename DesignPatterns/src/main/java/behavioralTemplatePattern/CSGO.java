package behavioralTemplatePattern;

public class CSGO extends Game{

	@Override
	void initialize() {
		System.out.println("CSGO Initialized to play!!\n");
	}

	@Override
	void startPlay() {
		System.out.println("CSGO GAme Started\n");
	}

	@Override
	void endPlay() {
		System.out.println("CSGO game ended\n");
	}

}
