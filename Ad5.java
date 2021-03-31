public class Ad5 {
    public static int countEven(int[] a) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                c++;
            }
        }

        return c;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };

        int c = countEven(a);
        System.out.println("The count of even no in given array is " + c);
    }
}
