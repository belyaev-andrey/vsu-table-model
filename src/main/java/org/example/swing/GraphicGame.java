package org.example.swing;

import org.example.model.Game;
import org.example.model.LocalGame;

import javax.swing.*;

public class GraphicGame {
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Hobby Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Game game = new LocalGame();//TODO new NetworkGame

        //Create and set up the content pane.
        GamePanel newContentPane = new GamePanel(game);
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}