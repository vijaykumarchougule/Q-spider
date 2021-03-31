import java.util.Scanner;
public class Ass10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= sc.nextInt();
        int temp=num;
        int sum=0;
        while(num>0){
            if(num%2==1)
            sum = sum +(num%10);
            num= num/10;

        }
        System.out.println("the sum all odd digits of number "+temp+" is "+sum);
        sc.close();
    }
}
