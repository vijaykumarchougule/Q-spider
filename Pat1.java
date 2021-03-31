 public class Pat1{
     public static void main(String[] args) {
         char n = 'a';
         for (int i = 1; i <= 4; i++) {
             for (int j = 1; j <= 4; j++) {
                 System.out.print(n);
                 n++;                 
             }
             n='a';
             System.out.println();
         }
     }
 }