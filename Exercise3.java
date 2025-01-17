package Lecture5;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int factorial = 1;
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Tong: " + factorial);
    }
}
