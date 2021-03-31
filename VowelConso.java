import java.util.Scanner;

public class VowelConso {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input ");

        char ch = sc.nextLine().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("The given character is lowercase vowel");
            } else {
                System.out.println("The given character is lowercase consonent");
            }

        } else if (ch >= 'A' && ch <= 'Z') {
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println("The given character is Uppercase vowel");
            } else {
                System.out.println("The given character is Uppercase consonent");
            }

        } else if (ch >= '0' && ch <= '9') {
            System.out.println("The given character is digit");
        } else if (ch == ' ') {
            System.out.println("It is space");

        } else {
            System.out.println("it is special character");
        }
        sc.close();
    }
}
