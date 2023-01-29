package Sem2;

import java.util.Scanner;
import java.util.logging.Logger;

public class Tsk2 {
    static Logger logger = Logger.getLogger(String.valueOf(Tsk2.class));
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
        logger.info(String.valueOf(num1+action+num2));
    }
}
