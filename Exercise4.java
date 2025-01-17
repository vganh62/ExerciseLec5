package Lecture5;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int dao = 0;
        while (n > 0) {
            int soCuoi = n % 10;
            dao = dao * 10 + soCuoi;
            n = n / 10;
        }
        System.out.println("Reverse number: " + dao);
    }
}
