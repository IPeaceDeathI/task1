package Prac_22.CalculatorGUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View {

    private JPanel panelMainFrame;

    private JButton btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine,
            btnPlus, btnMinus, btnDevide, btnMultiply, btnDot, btnClear, btnResult;

    private JTextField textUserInputField;

    public View(JPanel panelMainFrame){
        this.panelMainFrame = panelMainFrame;

        panelMainFrame.setSize(200,300);
        panelMainFrame.setMaximumSize(new Dimension(200,300));

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

        textUserInputField = new JTextField(16);
        textUserInputField.setEditable( false);

        JPanel panelMain = new JPanel();

        panelMain.add(textUserInputField);
        panelMain.add(btnPlus);
        panelMain.add(btnOne);
        panelMain.add(btnTwo);
        panelMain.add(btnThree);
        panelMain.add(btnMinus);
        panelMain.add(btnFour);
        panelMain.add(btnFive);
        panelMain.add(btnSix);
        panelMain.add(btnMultiply);
        panelMain.add(btnSeven);
        panelMain.add(btnEight);
        panelMain.add(btnNine);
        panelMain.add(btnDevide);
        panelMain.add(btnDot);
        panelMain.add(btnZero);
        panelMain.add(btnClear);
        panelMain.add(btnResult);

        panelMainFrame.add(panelMain);
    }

    public void setActionListener(ActionListener actionListener){
        btnMultiply.addActionListener(actionListener);
        btnDevide.addActionListener(actionListener);
        btnMinus.addActionListener(actionListener);
        btnPlus.addActionListener(actionListener);
        btnNine.addActionListener(actionListener);
        btnEight.addActionListener(actionListener);
        btnSeven.addActionListener(actionListener);
        btnSix.addActionListener(actionListener);
        btnFive.addActionListener(actionListener);
        btnFour.addActionListener(actionListener);
        btnThree.addActionListener(actionListener);
        btnTwo.addActionListener(actionListener);
        btnOne.addActionListener(actionListener);
        btnZero.addActionListener(actionListener);
        btnDot.addActionListener(actionListener);
        btnClear.addActionListener(actionListener);
        btnResult.addActionListener(actionListener);
    }

    public String getUserInput(){
        return textUserInputField.getText();
    }

    public void setTextUserInputField(String text){
        textUserInputField.setText(text);
    }

    public void showAlertDialog(String message){
        JOptionPane.showMessageDialog(panelMainFrame, message);
    }
}
