package org.example;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {

    private final String[][] fields = {
            {"Kathy", "Smith",
                    "Snowboarding"},
            {"John", "Doe",
                    "Rowing"},
            {"Sue", "Black",
                    "Knitting"},
            {"Jane", "White",
                    "Speed reading"},
            {"Joe", "Brown",
                    "Pool"}
    };

    private List<GameUpdateListener> listeners = new ArrayList<>();

    public String[][] getFields() {
        return fields;
    }

    public String makeMove() {
        Random r = new Random();
        int col = r.nextInt(0, 3);
        int row = r.nextInt(0, 5);
        String s = LocalTime.now().toString();
        fields[row][col] = s;
        listeners.forEach(l -> l.gameUpdated("New value: %s row: %d col: %d".formatted(s, row, col)));
        return s;
    }

    public void addGameUpdateListener(GameUpdateListener l) {
        listeners.add(l);
    }
}
