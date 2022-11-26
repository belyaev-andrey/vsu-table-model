package org.example.swing;

import org.example.model.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePanel extends JPanel {

    public GamePanel(Game game) {
        super(new BorderLayout());

        GameModel gameModel = new GameModel(game);
        JTable table = new JTable(gameModel);
        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        table.setFillsViewportHeight(true);

        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);

        //Add the scroll pane to this panel.
        add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton changeBtn = new JButton("Make Move");
        changeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.makeMove();
            }
        });
        buttonPanel.add(changeBtn);
        add(buttonPanel, BorderLayout.SOUTH);
    }


}
