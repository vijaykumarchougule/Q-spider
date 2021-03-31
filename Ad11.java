
public class Ad11 {
    public static int prime(int [] a) {
        int f=0;
        int sum=0;
        for (int i = 0; i <a.length; i++) {
            for (int j = 2; j < i; j++) {
                if(a[i]%j==0){
                    f=1;
                    break;
                }
            }
            if(f==0 && a[i]>1){
               sum = sum + a[i];
            }
            f=0;
            
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int sum = prime(a);
        System.out.println("The sum is "+sum);
    }
}
