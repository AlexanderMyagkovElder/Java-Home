package Sem1;

import java.util.Scanner;
//Вывести все простые числа от 1 до 1000
public class Tsk2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n=scan.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i+" ");
        }

    }
}
