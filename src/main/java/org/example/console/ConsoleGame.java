package org.example.console;

import org.example.model.Game;
import org.example.model.GameUpdateListener;
import org.example.model.LocalGame;

public class ConsoleGame {

    public static void main(String[] args) {
        Game g = new LocalGame();

        g.addGameUpdateListener(new GameUpdateListener() {
            @Override
            public void gameUpdated(String toString) {
                System.out.println(toString);
            }
        });

        for (int i = 0; i < 5; i++) {
            g.makeMove();
        }
    }

}
