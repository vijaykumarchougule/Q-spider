public class Ad9 {
    public static void displyArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        int c = 1;
        for (int i = 0; i < a.length; i++) {
            a[i] = c;
            c = c + 2;
        }

        displyArray(a);

    }
}
