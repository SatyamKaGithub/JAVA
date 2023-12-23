import java.util.Scanner;
// question : find largest among 3 numbers
public class Largestnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a > b & a > c){
            System.out.println("A is maximum");
        } else if (b > a & b > c){
            System.out.println("B is maximum");
        } else {
            System.out.println("C is maximum");
        }
    }
}
