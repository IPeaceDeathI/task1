package Prac_22.CalculatorGUI;

import Prac_22.Calculator.Calculator;
import Prac_22.Calculator.DivisionByZeroException;
import Prac_22.Calculator.EmptyStackException;

import java.util.Stack;

public class Model {

    private String stUserInput;
    private String stResult;

    public Model() {
        stUserInput = "";
        stResult = "";
    }

    public String getUserInput() {
        return stUserInput;
    }

    public void setUserInput(String stUserInput) {
        this.stUserInput = stUserInput;
    }

    public String getResult() {
        return stResult;
    }

    public void setResult(String stResult) {
        this.stResult = stResult;
    }

    public void fromPolandToNormal() throws EmptyStackException, divisionByZeroException, EmptyStringException, DoubleParseException {
        Double result = 0d;
        if (stUserInput.equals("")) throw new EmptyStringException();
        String currentPosition = "";
        Stack<Double> currentStack = new Stack<>();
        for(int i = 0; i < stUserInput.length(); i++){
            if (isOperand(((Character)stUserInput.charAt(i)).toString())){
                if (currentStack.size() < 2) throw new EmptyStackException();
                result = operationResult(currentStack.pop(), currentStack.pop(), ((Character)stUserInput.charAt(i)).toString());
                currentStack.push(result);
            }
            else if (stUserInput.charAt(i) == ' ' && !currentPosition.replace(" ", "").equals("") && !currentPosition.replace(" ", "").equals(".") ){
                try {
                    currentStack.push(Double.parseDouble(currentPosition.replace(" ", "")));
                }catch (Exception ex){
                    throw new DoubleParseException();
                }
                currentPosition = "";
            }
            else{
                currentPosition += stUserInput.charAt(i);
            }
        }

        stResult = String.valueOf(((currentStack.empty())? 0 :currentStack.pop()));
    }

    public boolean isOperand(String str){
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }

    private Double operationResult(Double firstNum, Double secondNum, String operand) throws divisionByZeroException {
        if (operand.equals("/") && firstNum == 0) throw new divisionByZeroException();
        switch(operand){
            case "+" : return firstNum + secondNum;
            case "-" : return secondNum - firstNum;
            case "*" : return firstNum * secondNum;
            case "/" : return secondNum / firstNum;
        }
        return 0d;
    }

}
