package Prac_22.Calculator;

import java.util.Stack;

public class Calculator {
    public static void main(String[] args) throws EmptyStackException {
        try {
            System.out.println(fromPolandToNormal("1.2 3 +"));
            System.out.println(fromPolandToNormal("4 5 * 6 7 * +"));
            System.out.println(fromPolandToNormal("2 0 /"));
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static double fromPolandToNormal(String RPNInput) throws EmptyStackException, DivisionByZeroException {
        Double result = 0d;
        String currentPosition = "";
        Stack<Double> currentStack = new Stack<>();
        for(int i = 0; i < RPNInput.length(); i++){
            if (isOperand(((Character)RPNInput.charAt(i)).toString())){
                if (currentStack.size() < 2) throw new EmptyStackException();
                result = operationResult(currentStack.pop(), currentStack.pop(), ((Character)RPNInput.charAt(i)).toString());
                currentStack.push(result);
            }
            else if (RPNInput.charAt(i) == ' ' && !currentPosition.replace(" ", "").equals("") && !currentPosition.replace(" ", "").equals(".")){
                currentStack.push(Double.parseDouble(currentPosition.replace(" ", "")));
                currentPosition = "";
            }
            else{
                currentPosition += RPNInput.charAt(i);
            }
        }
        return (currentStack.empty())? 0 :currentStack.pop();
    }

    public static boolean isOperand(String str){
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }
    public static Double operationResult(Double firstNum, Double secondNum, String operand) throws DivisionByZeroException {
        if (operand.equals("/") && firstNum == 0) throw new DivisionByZeroException();
        switch(operand){
            case "+" : return secondNum + firstNum;
            case "-" : return secondNum - firstNum;
            case "*" : return secondNum * firstNum;
            case "/" : return secondNum / firstNum;
        }
        return 0d;
    }
}
