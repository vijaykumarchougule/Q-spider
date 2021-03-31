import java.util.Scanner;

public class Med10 {
    public static int perfect(int a, int b) {
        int sum = 0;
        int r =0;
        System.out.println("\nPerfect number are ");
        for (int i = a; i <= b; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum = sum + j;
                }
            }
            if (sum == i) {
                System.out.println(i);
                r = r+i;
            
            }
            sum = 0;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = perfect(a, b);
        System.out.println("The sum of Perfect nos. in given range is "+result);
        sc.close();
    }
}
