public class Ad1 {
    public static void main(String[] args) {
        int[] a = { 2, 4, 7, 9, 45, 1, 46 };
        int small = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < small) {
                small = a[i];
            }
        }
        System.out.println("THe smallest number is " + small);
    }
}
