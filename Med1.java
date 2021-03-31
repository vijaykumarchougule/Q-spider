import java.util.Scanner;

public class Med1 {
    public static void printEven(int i, int j) {
        for (int a = i; a <= j; a++) {
            if (a % 2 == 0 && a % 5 == 0) {
                System.out.println("the even number divisible by 5 are " + a);
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ther range");
        int a = sc.nextInt();
        int b = sc.nextInt();

        printEven(a, b);
        sc.close();
    }
}
