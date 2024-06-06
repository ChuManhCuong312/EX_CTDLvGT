package GCD;

import java.util.Scanner;

public class GCD_de_quy {
    // Phương thức đệ quy
    public static int gcdDeQuy(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdDeQuy(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giá trị a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập giá trị b: ");
        int b = scanner.nextInt();

        System.out.println("GCD (đệ quy) của " + a + " và " + b + " là: " + gcdDeQuy(a, b));

        scanner.close();
    }
}
