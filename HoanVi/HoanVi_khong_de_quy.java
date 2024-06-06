package HoanVi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HoanVi_khong_de_quy {
    // Phương thức không đệ quy sử dụng thuật toán Heap
    public static List<List<Integer>> hoanViKhongDeQuy(int[] nums) {
        List<List<Integer>> ketQua = new ArrayList<>();
        int n = nums.length;
        int[] c = new int[n];

        List<Integer> hoanViDauTien = new ArrayList<>();
        for (int num : nums) {
            hoanViDauTien.add(num);
        }
        ketQua.add(new ArrayList<>(hoanViDauTien));

        int i = 0;
        while (i < n) {
            if (c[i] < i) {
                if (i % 2 == 0) {
                    hoanDoi(nums, 0, i);
                } else {
                    hoanDoi(nums, c[i], i);
                }
                List<Integer> hoanVi = new ArrayList<>();
                for (int num : nums) {
                    hoanVi.add(num);
                }
                ketQua.add(new ArrayList<>(hoanVi));
                c[i] += 1;
                i = 0;
            } else {
                c[i] = 0;
                i += 1;
            }
        }
        return ketQua;
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
        
        List<List<Integer>> ketQua = hoanViKhongDeQuy(arr);
        System.out.println("Hoán vị (không đệ quy): " + ketQua);
    }
}

