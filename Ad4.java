import java.util.Scanner;
public class Ad4 {
    public static void main(String[] args) {
        int [] a= {1,4,5,7,5,3};
        Scanner sc = new Scanner(System.in);
        System.out.println("Given Array is");
        for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]+" ");            
        }
        System.out.println("\nEnter the index where you want to swap");
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(b < a.length && c < a.length){
            a[b]=a[b]+a[c];
            a[c]=a[b]-a[c]; 
            a[b]=a[b]-a[c];
        }else{
            System.out.println("Enter correct index");
        }
        System.out.println("The swapped array is");
        for (int j = 0; j < a.length; j++) {
                System.out.print(a[j]+" ");            
        }

        sc.close();
    }
}
