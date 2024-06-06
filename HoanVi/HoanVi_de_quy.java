package HoanVi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HoanVi_de_quy {
    // Phương thức đệ quy
    public static void hoanViDeQuy(int[] arr, int l, int r, List<List<Integer>> ketQua) {
        if (l == r) {
            List<Integer> hoanVi = new ArrayList<>();
            for (int i : arr) {
                hoanVi.add(i);
            }
            ketQua.add(hoanVi);
        } else {
            for (int i = l; i <= r; i++) {
                hoanDoi(arr, l, i);
                hoanViDeQuy(arr, l + 1, r, ketQua);
                hoanDoi(arr, l, i); // backtrack
            }
        }
    }

    public static void hoanDoi(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của danh sách: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của danh sách:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        List<List<Integer>> ketQua = new ArrayList<>();
        hoanViDeQuy(arr, 0, arr.length - 1, ketQua);
        System.out.println("Hoán vị (đệ quy): " + ketQua);

        scanner.close();
    }
}
