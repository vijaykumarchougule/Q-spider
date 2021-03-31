import java.util.Scanner;
public class Med6 {
    public static int fact(int n){
       int f=1;
       while(n>0){
           f = f * n;
           n--;
       }
        return f;
    }
    public static void sumFactDigits(int num) {

        int temp = num;
        int sum = 0;
        while (num > 0) {
            sum = sum + fact(num % 10);
            num = num / 10;

        }
        // System.out.println("the sum of fact of digits of number " + temp + " is " + sum);
        if(sum==temp){
            System.out.println("The number is strong");
        }
        else{
            System.out.println("Number is not strong");
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        sumFactDigits(n);
        sc.close();
    }
}
