import java.util.Scanner;

public class arraypairing {
    public static void main(String[] args) {
        int n, i;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the size of array:");
            n = in.nextInt();
            int a[] = new int[n];
            System.out.println("Enter the numbers:");
            for (i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            printpairs(a);
        }
    }

    public static void printpairs(int a[]) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the pair size number:");
            in.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            int x = a[i];
            for (int j = i + 1; j < a.length; j++) {
                System.out.print("(" + x + "," + a[j] + ")");
            }
        }
    }
}