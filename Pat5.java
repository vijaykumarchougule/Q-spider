public class Pat5 {
    public static void main(String[] args) {
        int l = 1;
        char k ='a';
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j % 2 == 1) {
                    System.out.print(l);
                    l++;

                } else {
                    System.out.print(k);
                    k++;

                }
            }
            System.out.println();

        }
    }
}
