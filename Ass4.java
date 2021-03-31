import java.util.Scanner;

public class Ass4 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int i= sc.nextInt();
        int j= sc.nextInt();
        while (i <= j) {
            if(i%2==0){
            sum = sum + i;
            }
            i++;
        }
        System.out.println("the sum of even is "+ sum);
        sc.close();
    }
    
}
