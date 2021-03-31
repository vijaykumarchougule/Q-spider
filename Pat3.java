public interface Pat3 {
    public static void main(String[] args) {
        int n1= 1;
        char n2 = 'a';
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if(i%2==1){
                System.out.print(n1);
                n1++;
                }
                else{
                    System.out.print(n2);
                    n2++;
                }
            }
            n2='a';
            n1= 1;
            System.out.println();
        }
    }
}
