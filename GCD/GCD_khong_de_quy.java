package GCD;

import java.util.Scanner;

public class GCD_khong_de_quy {
    // Phương thức không đệ quy
    public static int gcdKhongDeQuy(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giá trị a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập giá trị b: ");
        int b = scanner.nextInt();

        System.out.println("GCD (không đệ quy) của " + a + " và " + b + " là: " + gcdKhongDeQuy(a, b));

        scanner.close();
    }
}
