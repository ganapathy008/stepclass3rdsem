package weekone;

import java.util.Scanner;

public class Inventory {
    static void analyzeInventory(int[] A, int[] B) {
        int sumA = 0, sumB = 0, max = 0, sec = 0, idx = 0;

        for (int i = 0; i < A.length; i++) {
            sumA += A[i];
            if (A[i] > max) {
                max = A[i];
                sec = 1; // Section A
                idx = i + 1;
            }
        }
        for (int i = 0; i < B.length; i++) {
            sumB += B[i];
            if (B[i] > max) {
                max = B[i];
                sec = 2; // Section B
                idx = i + 1;
            }
        }

        System.out.println("Section A Total: " + sumA +
                           " | Section B Total: " + sumB +
                           " | Status: " + (sumA == sumB ? "Balanced" : "Not Balanced"));
        System.out.println("Highest Quantity: " + max +
                           " (Section " + (sec == 1 ? "A" : "B") + ", Item " + idx + ")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of items:");
        int n = sc.nextInt();

        int[] A = new int[n];
        int[] B = new int[n];

        System.out.println("Enter quantities for Section A:");
        for (int i = 0; i < n; i++) A[i] = sc.nextInt();

        System.out.println("Enter quantities for Section B:");
        for (int i = 0; i < n; i++) B[i] = sc.nextInt();

        analyzeInventory(A, B);
    }
}

