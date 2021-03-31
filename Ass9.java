import java.util.Scanner;
public class Ass9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= sc.nextInt();
        int temp=num;
        int sum=0;
        while(num>0){
            sum = sum +(num%10);
            num= num/10;

        }
        System.out.println("the sum all digits of number "+temp+" is "+sum);
        sc.close();
    }
}
