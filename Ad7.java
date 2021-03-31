import java.util.Scanner;

public class Ad7 {
    public static int sumArray(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + (a[i] * a[i]);
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        System.out.println("Enter the array elements");
        int[] a = new int[size];
        for (int j = 0; j < a.length; j++) {
            a[j] = sc.nextInt();
        }

        int sum = sumArray(a);
        System.out.println("The sum of square of all array element is " + sum);
        sc.close();
    }
}
