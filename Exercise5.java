package Lecture5;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int dem = 0;
        if (n == 0) {
            dem = 1;
        } else {
            while (n != 0) {
                n = n / 10;
                dem++;
            }
        }
        System.out.println("So chu so: " + dem);
    }
}
