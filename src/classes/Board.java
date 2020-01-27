package classes;

import java.util.HashMap;
import java.util.Map;

public class Board {

    Map<String, PlayerBoard> boards;

    public Board () {
        boards = new HashMap<>();
        boards.put("1", new PlayerBoard());
        boards.put("2", new PlayerBoard());
        boards.put("1guess", new PlayerBoard());
        boards.put("2guess", new PlayerBoard());
    }

    public Map<String, PlayerBoard> getBoards () {
        return boards;
    }

    public PlayerBoard getBoard (String key) {
        return boards.get(key);
    }


    public Board fillOcean () {
        for (String key : getBoards().keySet()) {
            for (int i = 1; i <= getBoard(key).getPlayerBoard().length; i++) {

            }
        }

    }


}
