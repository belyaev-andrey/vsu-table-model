package org.example.model;

import java.util.List;

public interface Game {
    List<Player> getPlayers();

    String makeMove();

    void addGameUpdateListener(GameUpdateListener listener);
}
