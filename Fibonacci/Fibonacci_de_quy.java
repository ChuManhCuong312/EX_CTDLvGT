package Fibonacci;

import java.util.Scanner;

public class Fibonacci_de_quy {
    // Phương thức đệ quy
    public static int fibonacciDeQuy(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciDeQuy(n - 1) + fibonacciDeQuy(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị n: ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci (đệ quy) của " + n + " là: " + fibonacciDeQuy(n));
        scanner.close();
    }
}

