package org.example.model;

import java.util.*;

public class LocalGame implements Game {

    private final List<Player> players = new ArrayList<>();

    private final String[] hobbies = {"Snowboarding", "Rowing", "Knitting", "Speed reading", "Pool"};

    private final List<GameUpdateListener> listeners = new ArrayList<>();

    public LocalGame() {
        players.add(new Player("Kathy", "Smith"));
        players.add(new Player("John", "Doe"));
        players.add(new Player("Sue", "Black"));
        players.add(new Player("Jane", "White"));
        players.add(new Player("Joe", "Brown"));
    }

    @Override
    public List<Player> getPlayers() {
        return Collections.unmodifiableList(players);
    }

    @Override
    public String makeMove() {
        Random r = new Random();
        Player player = players.get(r.nextInt(0, players.size()));
        String hobby = hobbies[r.nextInt(0, hobbies.length)];
        player.setHobby(hobby);
        listeners.forEach(l -> l.gameUpdated(player.toString()));
        return hobby;
    }

    @Override
    public void addGameUpdateListener(GameUpdateListener listener) {
        listeners.add(listener);
    }
}
