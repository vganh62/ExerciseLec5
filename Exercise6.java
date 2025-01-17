package Lecture5;

public class Exercise6 {

    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100: ");
        for (int n = 2; n <= 100; n++) {
            boolean prime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(n + " ");
            }
        }
    }
}
