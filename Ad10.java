
public class Ad10 {
    public static void prime(int [] a) {
        int f=0;
        for (int i = 0; i <a.length; i++) {
            for (int j = 2; j < i; j++) {
                if(a[i]%j==0){
                    f=1;
                    break;
                }
            }
            if(f==0 && a[i]>1){
                System.out.println(a[i]);
            }
            f=0;
            
        }
    }
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
        prime(a);
       
    }
}
