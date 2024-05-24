package Template;

abstract class Game {
  
	public final String play() {
	    String result = initialize();
	    result += startPlay();
	    result += endPlay();
	    return result;
	}


    private String initialize() {
        return "Initializing game...\n";
    }

    private String endPlay() {
        return "Ending game...\n";
    }


    public abstract String startPlay();
}

