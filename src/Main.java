import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int checker = 0;
        while (checker == 0) {
            System.out.println("What operation would you like to carry out?");
            String operation1 = in.nextLine();
            if (operation1.equals("+")) {
                System.out.println("Enter a number");
                int num1 = in.nextInt();
                System.out.println("Enter a number");
                int num2 = in.nextInt();
                System.out.println(num1 + num2);
            }
            if (operation1.equals("-")) {
                System.out.println("Enter a number");
                int num1 = in.nextInt();
                System.out.println("Enter a number");
                int num2 = in.nextInt();
                System.out.println(num1 - num2);
            }
            if (operation1.equals("*")) {
                System.out.println("Enter a number");
                int num1 = in.nextInt();
                System.out.println("Enter a number");
                int num2 = in.nextInt();
                System.out.println(num1 * num2);
            }
            if (operation1.equals("/")) {
                System.out.println("Enter a number");
                int num1 = in.nextInt();
                System.out.println("Enter a number");
                int num2 = in.nextInt();
                System.out.println(num1 / num2);
            }
            if (operation1.equals("!")) {
                System.out.println("Enter a number");
                int num1 = in.nextInt();
                int total = 1;
                for (int i = 1; i <= num1; i++) {
                    total = total * i;
                }
                System.out.println(total);
            }
            if (operation1.equals("sum")) {
                System.out.println("Enter a number");
                int num1 = in.nextInt();
                int total = 0;
                for (int i = 0; i <= num1; i++) {
                    total = total + i;
                }
                System.out.println(total);
            }
            if (operation1.equals("sum-mul")) {
                System.out.println("Enter a number");
                int num1 = in.nextInt();
                System.out.println("Enter a multiple target");
                int num2 = in.nextInt();
                int total = 0;
                for (int i = 1; i <= num1; i++) {
                    if (i % num2 == 0) {
                        total = total + i;
                    }
                }
                System.out.println(total);
            }
            if (operation1.equals("table")) {
                System.out.println("Enter a number");
                int num1 = in.nextInt();
                for (int i = 0; i <= 10; i++) {
                    int ans = num1 * i;
                    System.out.println(num1 + " x " + i + " = " + ans);
                }
            }
            if (operation1.equals("quit")) {
                checker = 1;
            }
        }
    }
}