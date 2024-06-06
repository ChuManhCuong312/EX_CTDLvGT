package Fibonacci;

import java.util.Scanner;

public class Fibonacci_khong_de_quy {
    // Phương thức không đệ quy
    public static int fibonacciKhongDeQuy(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị n: ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci (không đệ quy) của " + n + " là: " + fibonacciKhongDeQuy(n));
    }
}

