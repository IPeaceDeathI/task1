package Prac_15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class lang extends JFrame {
    private JPanel[] pnl = new JPanel[3];

    public lang() {
        super("Language");
        setSize(250, 150);
        setLayout(new GridLayout(3, 1));
        final JLabel countryName = new JLabel(" ");
        final JLabel description = new JLabel("");

        String[] сountries = {"Australia", "China", "England", "Russia"};

        for (int i = 0; i < 3; i++) {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }

        JComboBox comboBox = new JComboBox(сountries);
        pnl[0].add(comboBox);
        pnl[1].add(countryName);
        pnl[2].add(description);

        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox) e.getSource();
                String item = (String) box.getSelectedItem();
                countryName.setText(item);

                switch (item) {
                    case "Australia":
                        description.setText("Not Austria!");
                        break;
                    case "China":
                        description.setText("Country with largest population.");
                        break;
                    case "England":
                        description.setText("Country on island.");
                        break;
                    case "Russia":
                        description.setText("Country with the biggest territory.");
                        break;
                }
            }
        });

    }
}
