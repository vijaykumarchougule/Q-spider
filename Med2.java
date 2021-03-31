import java.util.Scanner;

public class Med2 {
    public static void sumEvenDigits(int num) {

        int temp = num;
        int sum = 0;
        while (num > 0) {
            if (num % 2 == 0)
                sum = sum + (num % 10);
            num = num / 10;

        }
        System.out.println("the sum all even digits of number " + temp + " is " + sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        sumEvenDigits(n);
        sc.close();
    }
}
