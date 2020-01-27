package classes;

import java.util.HashMap;
import java.util.Map;

public class Board {

    Map<String, PlayerBoard> board;

    public Board () {
        board = new HashMap<>();
        board.put("1", new PlayerBoard());
        board.put("2", new PlayerBoard());
        board.put("1guess", new PlayerBoard());
        board.put("2guess", new PlayerBoard());
    }

    public Map<String, PlayerBoard> getBoard () {
        return board;
    }

    public PlayerBoard getPlayerBoard (String key) {
        return board.get(key);
    }


}
