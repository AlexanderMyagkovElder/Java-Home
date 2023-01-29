package Sem2;

import java.util.Scanner;

public class Tsk2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=scan.nextInt();
        System.out.println("Enter action +,-,*, or /: ");
        String action=scan.next();
        System.out.println("Enter second number: ");
        int num2=scan.nextInt();
        switch (action){
            case "+" : System.out.println(num1+num2); break;
            case "-": System.out.println(num1-num2); break;
            case "*" : System.out.println(num1*num2); break;
            case "/": System.out.println(num1/num2); break;
            default: System.out.println("Whoops! wrong action, man...");
        }

    }
}
