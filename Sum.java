import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Provide first number : ");
        double num1 = input.nextDouble();
        System.out.print("Provide second number : ");
        double num2 = input.nextDouble();
        double sum = num1 + num2;
        System.out.println("Sum of the given number is : " + sum);
//        if(sum == 50){
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }
    }
}
