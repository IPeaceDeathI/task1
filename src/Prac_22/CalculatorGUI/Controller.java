package Prac_22.CalculatorGUI;

import Prac_22.Calculator.Calculator;
import Prac_22.Calculator.DivisionByZeroException;
import Prac_22.Calculator.EmptyStackException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller extends JFrame {

    public Controller(){
        super("Calculator");
        setSize(200,300);
        View view = new View((JPanel) getContentPane());
        Model model = new Model();
        ActionListener btnActionListenter = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().charAt(0) == '='){
                    model.setUserInput(view.getUserInput());
                    try {
                        model.fromPolandToNormal();
                    } catch (EmptyStackException ex) {
                        clear(model, view);
                        view.showAlertDialog(ex.getMessage());
                    } catch (divisionByZeroException ex) {
                        clear(model, view);
                        view.showAlertDialog(ex.getMessage());
                    } catch (EmptyStringException ex) {
                        clear(model, view);
                        view.showAlertDialog(ex.getMessage());
                    } catch (DoubleParseException ex) {
                        clear(model,view);
                        view.showAlertDialog(ex.getMessage());
                    }

                    view.setTextUserInputField(model.getResult());
                }
                else if(e.getActionCommand().charAt(0) == 'C'){
                    clear(model, view);
                }
                else if(e.getActionCommand().charAt(0) == '.'){
                    if (view.getUserInput().length() != 0 && model.isOperand(((Character)view.getUserInput().charAt(view.getUserInput().length()-1)).toString())){
                        view.showAlertDialog("Wrong place for '.'!");
                        clear(model,view);
                    }
                    view.setTextUserInputField(view.getUserInput() + e.getActionCommand());
                }
                else if(view.getUserInput().length()==0 && e.getActionCommand().charAt(0) == '.'){
                    view.showAlertDialog("Wrong place for '.'!");
                }
                else if(view.getUserInput().length()!= 0 && view.getUserInput().charAt(view.getUserInput().length()-1) == '.'){
                    view.setTextUserInputField(view.getUserInput() + e.getActionCommand());
                }
                else{
                    view.setTextUserInputField(view.getUserInput()+ " " + e.getActionCommand());
                }
            }
        };
        view.setActionListener(btnActionListenter);
        setVisible(true);
    }
    private void clear(Model model, View view){
        model.setResult("");
        model.setUserInput("");
        view.setTextUserInputField("");
    }
}
