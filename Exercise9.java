package Lecture5;

import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int soGoc = n;
        int soDao = 0;
        while (n > 0) {
            int soCuoi = n % 10;
            soDao = soDao * 10 + soCuoi;
            n /= 10;
        }
        if (soGoc == soDao) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }
    }
}
