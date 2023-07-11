
// import java.io.*;
import java.util.Scanner;

public class num {
    public static void main(String args[]) {
        int i, j;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter n value:");
            i = in.nextInt();
        }
        System.out.println("Number are:");
        for (j = 1; j <= i; j++) {
            if ((j % 2 == 0) && (j % 7 == 0)) {
                System.out.println(j + "=Masterblaster");
            } else if (j % 7 == 0) {
                System.out.println(j + "=blaster");
            } else if (j % 2 == 0) {
                System.out.println(j + "=master");
            }
        }
    }
}