package Sem1;

import java.util.Scanner;

//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class Tsk1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n=scan.nextInt();
        int sum=1;
        for (int i = 2; i <= n; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
