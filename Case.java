import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fruit : ");
        String fruit = input.next();
        switch (fruit) {
            case "Mango" -> System.out.println("king of fruit");
            // if we don't put break after every case it will evaluate the next case also until it find break or default statement
            case "Apple" -> System.out.println("Fruit of Kashmir");
            case "Orange" -> System.out.println("Citrus Fruit");
            case "Grape" -> System.out.println("Small fruit");
            default -> System.out.println("Invalid input");
        }
    }
}