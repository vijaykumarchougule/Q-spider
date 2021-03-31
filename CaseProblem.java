import java.util.Scanner;

public class CaseProblem {
    public static int addTwo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum is: " + sum);
        return 0;
    }

    public static int addThree() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a + b + c;
        System.out.println("Sum is: " + sum);
        return 0;
    }

    public static int addFour() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int sum = a + b + c + d;
        System.out.println("Sum is: " + sum);
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("......!!! Welcome !!!......");
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int n = 1;
        while (true) {
            if (n == 1) {
                System.out.println("Press 1 to add 2 numbers");
                System.out.println("Press 2 to add 3 numbers");
                System.out.println("Press 3 to add 4 numbers");
                int ch = sc.nextInt();
                switch (ch) {
                case 1: {
                    addTwo();
                    break;
                }
                case 2: {
                    addThree();
                    break;

                }
                case 3: {
                    addFour();
                    break;
                }
                default: System.out.println("Invalid selection");
                }
                System.out.println("press one to continue");
                n = sc.nextInt();

            }else{
                break;
            }
            
        }
     
        System.out.println("......!!! End !!!......");
        sc.close();
    }
}
