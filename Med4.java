import java.util.Scanner;
public class Med4 {
    public static void sumDigits(int num) {

        int temp = num;
        int sum = 0;
        while (num > 0) {
            sum = sum + (num % 10);
            num = num / 10;

        }
        System.out.println("the sum all digits of number " + temp + " is " + sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        sumDigits(n);
        sc.close();
    }
}
