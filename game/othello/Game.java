public enum Direction {
    left, right, up, down
}

public enum Color {
    White, Black
}

public class Game {
    private Player[] players;
    private static Game instance;
    private Board board;
    private final int ROWS = 10;
    private final int COLUMNS = 10;

    private Game() {
	board = new Board(ROWS, COLUMNS);
	players = new Players[2];
	players[0] = new Player(Color.Black);
	players[1] = new Player(Color.White);
    }

    public static Game getInstance() {
	if (instance == null) instance = new Game();
	return instance;
    }

    public Board getBoard() {
	return board;
    }
    
}
