import java.util.Scanner;

public class Med3 {
    public static int count(int num) {
        int c = 0;
        while (num > 0) {
            num = num / 10;
            c++;
        }
        return c;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int c = count(n);
        System.out.println("The count of digits in given number is " + c);
        sc.close();
    }
}
