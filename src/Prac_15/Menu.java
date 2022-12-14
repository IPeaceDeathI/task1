package Prac_15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu extends JFrame {
    private JPanel[] pnl = new JPanel[6];

    private JButton btnFirst = new JButton("Button 1");
    private JButton btnSecond = new JButton("Button 2");
    public Menu() {
        super("Menu");
        setSize(250, 150);
        setLayout(new GridLayout(2, 3));

        JTextArea textArea = new JTextArea("Some text");
        for(int i = 0; i < 6; i++){
            pnl[i] = new JPanel();
            add(pnl[i]);
        }
        pnl[0].add(btnFirst);
        pnl[2].add(btnSecond);
        pnl[4].add(textArea);

        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        JMenuItem itemSave = new JMenuItem("Save");
        menuFile.add(itemSave);
        JMenuItem itemExit = new JMenuItem("Exit");
        menuFile.add(itemExit);

        JMenu menuEdit = new JMenu("Edit");
        JMenuItem itemCopy = new JMenuItem("Copy");
        menuEdit.add(itemCopy);
        JMenuItem itemCut = new JMenuItem("Cut");
        menuEdit.add(itemCut);
        JMenuItem itemPaste = new JMenuItem("Paste");
        menuEdit.add(itemPaste);

        JMenu menuHelp = new JMenu("Help");
        menuBar.add(menuFile);
        menuBar.add(menuEdit);
        menuBar.add(menuHelp);
        setJMenuBar(menuBar);
    }
}
