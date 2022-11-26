package org.example.net;

import org.example.model.Game;
import org.example.model.GameUpdateListener;
import org.example.model.Player;

import java.util.List;

public class NetworkGame implements Game {

    @Override
    public List<Player> getPlayers() {
        return null; //TODO сходить к серверу и спросить список игроков
    }

    @Override
    public String makeMove() {
        return null; //TODO
    }

    @Override
    public void addGameUpdateListener(GameUpdateListener listener) {
        //TODO
    }
}
