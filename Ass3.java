import java.util.Scanner;
public class Ass3 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int i= sc.nextInt();
        int j= sc.nextInt();
        while (i <= j) {
            sum = sum + i;
            i++;
        }
        System.out.println("the sum is "+ sum);
        sc.close();
    }
}
