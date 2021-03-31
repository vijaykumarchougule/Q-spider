import java.util.Scanner;
public class Med8 {
    public static void perfect(int a , int b){
        int sum=0;
        System.out.println("\n Perfect number are ");
        for (int i = a; i <= b; i++) {
            for (int j = 1; j < i; j++) {
                if(i%j==0){
                    sum =sum +j ;
                }
            }
            if(sum==i){
                System.out.println(i);
            }
            sum=0;
        }
        

    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int a = sc.nextInt();
        int b= sc.nextInt();
        perfect(a, b);
        sc.close(); 
    }
}
