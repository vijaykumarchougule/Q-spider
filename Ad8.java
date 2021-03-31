import java.util.Scanner;

public class Ad8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        System.out.println("Enter the array elements");
        int[] a = new int[size];
        for (int j = 0; j < a.length; j++) {
            a[j] = sc.nextInt();
        }
        System.out.println("The entered array is");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        int n = size;
        int[] b = new int[n];
        for (int l = 0; l < b.length; l++) {
            b[n - 1] = a[l];
            n--;

        }
        System.out.println("\nThe revered array is");
        for (n = 0; n < b.length; n++) {
            System.out.print(b[n] + " ");
        }
        sc.close();
    }
}
