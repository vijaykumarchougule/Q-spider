import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character ");
        char ch = sc.next().charAt(0);
        switch (ch) {
        case 'A':
            System.out.println("Yes it is Uppercase Vowel");
            break;
        case 'E':
            System.out.println("Yes it is Uppercase Vowel");
            break;
        case 'I':
            System.out.println("Yes it is Uppercase Vowel");
            break;
        case 'O':
            System.out.println("Yes it is Uppercase Vowel");
            break;
        case 'U':
            System.out.println("Yes it is Uppercase Vowel");
            break;
        default:
            System.out.println("NO it is NOt Uppercase Vowel");
        }
        sc.close();
    }
}
