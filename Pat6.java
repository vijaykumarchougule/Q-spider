public class Pat6 {
    public static void main(String[] args) {
        int l = 1;
        int k = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j % 2 == 1) {
                    System.out.print(l);

                } else {
                    System.out.print(k);

                }
            }
            System.out.println();

        }
    }
}