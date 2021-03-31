import java.util.Scanner;
public class Bd1 {
    public static void test(int n){
        int a= 0;
        int b= 1;
        int temp;
        System.out.println("The series will be");
        for (int i = 0; i < n; i++) {
           System.out.println(a);
           temp= a;
           a=b;
           b=a+temp;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n = sc.nextInt();
        test(n);
        sc.close();
    }
}
