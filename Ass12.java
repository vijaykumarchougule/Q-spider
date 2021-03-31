import java.util.Scanner;
public class Ass12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int num = sc.nextInt();
        int sum =0;
        for(int i=1; i<num; i++){
            if(num%i==0){
                sum = sum + i;
            }
        }
        if(sum==num){
            System.out.println("Yes perfect");
        }
        else{
            System.out.println("Not perfect");
        }
        sc.close();
    }
}
