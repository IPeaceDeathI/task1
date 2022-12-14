package Java_test.Task_1.Task_8;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i]=sc.next();
        }
        for(int i=0; i<(n/2); i++){
            String temp = str[i];
            str[i]=str[n-i-1];
            str[n-i-1]=temp;
        }

        for(int i=0; i<n; i++){
            System.out.println(str[i]);
        }

    }
}
