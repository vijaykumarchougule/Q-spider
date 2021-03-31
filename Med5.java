import java.util.Scanner;
public class Med5 {
    public static void sumSqureDigits(int num) {

        int temp = num;
        int sum = 0;
        while (num > 0) {
            sum = sum + ((num % 10) * (num % 10));
            num = num / 10;

        }
        System.out.println("the sum of square of digits of number " + temp + " is " + sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        sumSqureDigits(n);
        sc.close();
    }
}
