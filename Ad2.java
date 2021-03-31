import java.util.Scanner;

public class Ad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        System.out.println("Enter the array elements");
        int [] a = new int [size]; 
        for (int j = 0; j < a.length; j++) {
            a[j] = sc.nextInt(); 
        }
        int sum=0;
        double avrg=0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        avrg = sum/a.length;
        System.out.println("The Average is "+avrg);
        sc.close();
    }
}
