package Prac_15;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Calc extends JFrame{
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JPanel[] pnl = new JPanel[6];
    JButton buttonPlus = new JButton(" +");
    JButton buttonMinus = new JButton(" -");
    JButton buttonDiv = new JButton(" /");
    JButton buttonMult = new JButton(" *");
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    Calc(){
        super("Calculator");
        setLayout(new GridLayout(3,2));
        for(int i = 0 ; i < pnl.length ; i++)
        {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }
        setSize(250,150);
        pnl[0].add(jta1);
        pnl[1].add(jta2);
        pnl[2].add(buttonPlus);
        pnl[3].add(buttonMinus);
        pnl[4].add(buttonDiv);
        pnl[5].add(buttonMult);
        buttonPlus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = "+(x1+x2),"Alert",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception exception){
                    JOptionPane.showMessageDialog( null, "Error in Numbers!","alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        buttonMinus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = "+(x1-x2),"Alert",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception exception){
                    JOptionPane.showMessageDialog( null, "Error in Numbers!","alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        buttonDiv.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = "+(x1/x2),"Alert",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception exception){
                    JOptionPane.showMessageDialog( null, "Error in Numbers!","alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        buttonMult.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = "+(x1*x2),"Alert",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception exception){
                    JOptionPane.showMessageDialog( null, "Error in Numbers!","alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}