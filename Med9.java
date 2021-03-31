import java.util.Scanner;

public class Med9 {
    public static int prime(int a, int b) {
        int f = 0;
        int sum = 0;
        for (int i = a; i <= b; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    f = 1;
                    break;
                }
            }
            if (f == 0 && i > 1) {
                System.out.println(i);
                sum = sum + i;
            }
            f = 0;

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter the range");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = prime(a, b);
        System.out.println("The sum of the all prime number in given range is " + sum);
        sc.close();
    }
}
