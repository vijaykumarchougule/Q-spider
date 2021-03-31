import java.util.Scanner;
public class Ass8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int i= sc.nextInt();
        int j= sc.nextInt();
        while (i <= j) {
           int sqr = i*i;
           System.out.println("The square of "+i+" is "+ sqr);
           i++; 
        }
        sc.close();

    }
}
