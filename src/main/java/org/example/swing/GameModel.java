package org.example.swing;

import org.example.model.Game;
import org.example.model.GameUpdateListener;
import org.example.model.Player;

import javax.swing.table.AbstractTableModel;

public class GameModel extends AbstractTableModel implements GameUpdateListener {

    private final Game game;

    private final String[] columns = {"First Name", "Last Name", "Hobby"};

    public GameModel(Game game) {
        this.game = game;
        game.addGameUpdateListener(this);
    }

    @Override
    public void gameUpdated(String toString) {
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int colIdx) {
        return columns[colIdx];
    }

    @Override
    public int getRowCount() {
        return game.getPlayers().size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Player player = game.getPlayers().get(rowIndex);
        return switch (columnIndex) {
            case 0 -> player.getFirstName();
            case 1 -> player.getLastName();
            case 2 -> player.getHobby();
            default -> null;
        };
    }

}
