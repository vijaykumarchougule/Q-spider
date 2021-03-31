import java.util.Scanner;
public class Med7 {
    public static void prime(int a, int b) {
        int f=0;
        for (int i = a; i <=b; i++) {
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    f=1;
                    break;
                }
            }
            if(f==0 && i>1){
                System.out.println(i);
            }
            f=0;
            
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the range");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        prime(a, b);
        sc.close();
    }
}
