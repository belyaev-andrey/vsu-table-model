package org.example;

import javax.swing.table.AbstractTableModel;

public class GameModel extends AbstractTableModel {

    private final Game game;

    public GameModel(Game game) {
        this.game = game;
    }

    private final String[] columnNames = {"First Name",
            "Last Name",
            "Sport"};

    public int getColumnCount() {
        return game.getFields()[0].length;
    }

    public int getRowCount() {
        return game.getFields().length;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        return game.getFields()[row][col];
    }

    public Class<?> getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

}
