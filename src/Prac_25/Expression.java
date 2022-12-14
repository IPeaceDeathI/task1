package Prac_25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expression {
    public static void main(String[] args) {
        System.out.println("(1*+*2)*–*3*×*4:\t" + (Expresion("(1*+*2)*–*3*×*4") ? "Correct" : "Incorrect"));
        System.out.println("((1*+*2)*–*3*×*4:\t" + (Expresion("((1*+*2)*–*3*×*4") ? "Correct" : "Incorrect"));
    }

    public static Boolean Expresion(String stExpression){
        Pattern pattern = Pattern.compile("\\([^()]*\\)");
        Matcher matcher;
        while ((matcher = pattern.matcher(stExpression)).find())
            stExpression = matcher.replaceAll("");
        return !(stExpression.contains("(") || stExpression.contains((")")));
    }
}

