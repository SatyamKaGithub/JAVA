import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        while (true){
            // taking operator as input
            System.out.print("Enter the operator : ");
            char op = input.next().trim().charAt(0);
            System.out.println();
            if (op == '+' || op == '-' || op == '/' || op == '*' || op == '%' ){
                System.out.print("Enter the first number : ");
                System.out.println();
                int num1 = input.nextInt();
                System.out.print("Enter the second number :  ");
                System.out.println();
                int num2 = input.nextInt();
                if (op == '+'){
                    ans = num1 + num2;
                }
                if (op == '-'){
                    ans = num1 - num2;
                }
                if (op == '/'){
                    ans = num1 / num2;
                }
                if (op == '*'){
                    ans = num1 * num2;
                }
                if(op == '%'){
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X'){
                break;
            } else {
                System.out.println("Invalid response");
            }
            System.out.println(ans);
        }
    }
}
