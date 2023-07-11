import java.util.Scanner;

public class sorting {
    public static void main(String args[]) {
        int a, i, j, b, m;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter size:");
            a = in.nextInt();
            int arr[] = new int[a];
            System.out.println("Enter numbers:");
            for (i = 0; i < a; i++) {
                arr[i] = in.nextInt();
            }
            int temp = 0;
            for (i = 0; i < a; i++) {
                for (j = i + 1; j < a; j++) {
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println("ordered array:");
            for (i = 0; i < a; i++) {
                if (arr[i] % 2 != 0) {
                    System.out.println(arr[i]);
                }
            }
            for (b = 0; b < a; b++) {
                for (m = 0; m < a; m++) {
                    if (arr[b] > arr[m]) {
                        temp = arr[b];
                        arr[b] = arr[m];
                        arr[m] = temp;
                    }
                }
            }
            for (b = 0; b < a; b++) {
                if (arr[b] % 2 == 0) {
                    System.out.println(arr[b]);
                }
            }
        }
    }
}
