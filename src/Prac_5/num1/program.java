package Prac_5.num1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class program extends JFrame {
    private int milanCount;
    private int madridCount;
    JPanel[] pnl = new JPanel[9];
    JButton but1 = new JButton("AC Milan");
    JButton but2 = new JButton("Real Madrid");
    JLabel result = new JLabel("Result: 0 X 0");
    JLabel scorer = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");

    public program() {
        super("Football");
        setLayout(new GridLayout(3, 3));
        setSize(900, 600);
        for (int i = 0; i < pnl.length; i++) {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }
        pnl[1].add(scorer);
        pnl[3].add(but1);
        pnl[4].add(result);
        pnl[5].add(but2);
        pnl[7].add(winner);
        milanCount = 0;
        madridCount = 0;

        setResizable(false);
        setBackground(Color.CYAN);

        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanCount++;
                String strResult = "Result: " + milanCount + " X " + madridCount;
                String strScorer = "Last Scorer: AC Milan";
                String strWinner = "Winner:";
                if (milanCount > madridCount) strWinner += "AC Milam";
                else if (milanCount < madridCount) strWinner += "Real Madrid";
                else strWinner += "DRAW";

                result.setText(strResult);
                scorer.setText(strScorer);
                winner.setText(strWinner);
            }
        });
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridCount++;
                String strResult = "Result: " + milanCount + " X " + madridCount;
                String strScorer = "Last Scorer: Real Madrid";
                String strWinner = "Winner:";
                if (milanCount > madridCount) strWinner += "AC Milam";
                else if (milanCount < madridCount) strWinner += "Real Madrid";
                else strWinner += "DRAW";

                result.setText(strResult);
                scorer.setText(strScorer);
                winner.setText(strWinner);
            }
        });
    }


    public static void main(String[] args) {
        new program().setVisible(true);
    }
}
