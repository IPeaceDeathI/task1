package Prac_15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewCalc extends JFrame {
    private JButton btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine,
            btnPlus, btnMinus, btnDevide, btnMultiply, btnDot, btnClear, btnResult;
    private JPanel pnl = new JPanel();
    NewCalc() {
        super("calculator");
        setSize(200, 300);
        setMaximumSize(new Dimension(200, 300));
        final String[] s0 = {""};
        final String[] s1 = {""};
        final String[] s2 = {""};

        JTextField textUserInput = new JTextField(16);
        textUserInput.setEditable(false);

        btnZero = new JButton("0");
        btnOne = new JButton("1");
        btnTwo = new JButton("2");
        btnThree = new JButton("3");
        btnFour = new JButton("4");
        btnFive = new JButton("5");
        btnSix = new JButton("6");
        btnSeven = new JButton("7");
        btnEight = new JButton("8");
        btnNine = new JButton("9");

        btnResult = new JButton("=");
        btnPlus = new JButton("+");
        btnMinus = new JButton("-");
        btnDevide = new JButton("/");
        btnMultiply = new JButton("*");
        btnClear = new JButton("C");
        btnDot = new JButton(".");

        ActionListener btnActionListenter = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = e.getActionCommand();
                if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
                    if (!s1[0].equals(""))
                        s2[0] += s;
                    else {
                        s0[0] = s0[0] + s;
                    }
                    textUserInput.setText(s0[0] + s1[0] + s2[0]);
                } else if (s.charAt(0) == 'C') {
                    s0[0] = s1[0] = s2[0] = "";
                    textUserInput.setText(s0[0] + s1[0] + s2[0]);
                } else if (s.charAt(0) == '=') {

                    double result;
                    if (s1[0].equals("+"))
                        result = (Double.parseDouble(s0[0]) + Double.parseDouble(s2[0]));
                    else if (s1[0].equals("-"))
                        result = (Double.parseDouble(s0[0]) - Double.parseDouble(s2[0]));
                    else if (s1[0].equals("/"))
                        result = (Double.parseDouble(s0[0]) / Double.parseDouble(s2[0]));
                    else
                        result = (Double.parseDouble(s0[0]) * Double.parseDouble(s2[0]));
                    textUserInput.setText(s0[0] + s1[0] + s2[0] + "=" + result);
                    s0[0] = Double.toString(result);
                    s1[0] = s2[0] = "";
                } else {
                    if (s1[0].equals("") || s2[0].equals(""))
                        s1[0] = s;
                    else {
                        double result;

                        if (s1[0].equals("+"))
                            result = (Double.parseDouble(s0[0]) + Double.parseDouble(s2[0]));
                        else if (s1[0].equals("-"))
                            result = (Double.parseDouble(s0[0]) - Double.parseDouble(s2[0]));
                        else if (s1[0].equals("/"))
                            result = (Double.parseDouble(s0[0]) / Double.parseDouble(s2[0]));
                        else
                            result = (Double.parseDouble(s0[0]) * Double.parseDouble(s2[0]));
                        s0[0] = Double.toString(result);
                        s1[0] = s;
                        s2[0] = "";
                    }
                    textUserInput.setText(s0[0] + s1[0] + s2[0]);
                }
            }
        };

        btnMultiply.addActionListener(btnActionListenter);
        btnDevide.addActionListener(btnActionListenter);
        btnMinus.addActionListener(btnActionListenter);
        btnPlus.addActionListener(btnActionListenter);
        btnNine.addActionListener(btnActionListenter);
        btnEight.addActionListener(btnActionListenter);
        btnSeven.addActionListener(btnActionListenter);
        btnSix.addActionListener(btnActionListenter);
        btnFive.addActionListener(btnActionListenter);
        btnFour.addActionListener(btnActionListenter);
        btnThree.addActionListener(btnActionListenter);
        btnTwo.addActionListener(btnActionListenter);
        btnOne.addActionListener(btnActionListenter);
        btnZero.addActionListener(btnActionListenter);
        btnDot.addActionListener(btnActionListenter);
        btnClear.addActionListener(btnActionListenter);
        btnResult.addActionListener(btnActionListenter);

        pnl.add(textUserInput);
        pnl.add(btnPlus);
        pnl.add(btnOne);
        pnl.add(btnTwo);
        pnl.add(btnThree);
        pnl.add(btnMinus);
        pnl.add(btnFour);
        pnl.add(btnFive);
        pnl.add(btnSix);
        pnl.add(btnMultiply);
        pnl.add(btnSeven);
        pnl.add(btnEight);
        pnl.add(btnNine);
        pnl.add(btnDevide);
        pnl.add(btnDot);
        pnl.add(btnZero);
        pnl.add(btnClear);
        pnl.add(btnResult);

        add(pnl);
    }
}
