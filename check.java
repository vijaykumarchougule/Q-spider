class Check{
    public static void main(String[] args) {
        int a = 10, b =20, c =30, d;

        d = (a>b && a>c)?a:(b>a && b>c)?b:c;

        System.out.println(d);
    }
}
