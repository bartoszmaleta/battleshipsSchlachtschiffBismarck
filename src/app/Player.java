package app;

import static app.testingFunctions.BattleStatic.ocean;

public class Player {

    String name;
    int move = 0;

    public Player() {

    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}