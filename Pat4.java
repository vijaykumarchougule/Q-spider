public class Pat4 {
    public static void main(String[] args) {
        int k = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (k == 10) {
                    k = 0;
                }
                System.out.print(k);
                k++;
            }
            
            System.out.println();
        }
    }

}
