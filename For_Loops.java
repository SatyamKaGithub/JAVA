import java.util.Scanner;

public class For_Loops {
    public static void main(String[] args) {
        /*
        Syntax -  for loop :
        for (initialisation, conditions, increment/decrement){
        body
        }
         */
// Q : print 1 to 10 using for loop
//        for (int num = 1; num <=10; num++){
//            System.out.println(num);
//        }

        // Q : print from 1 to n (n is user input)
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int num = 1; num <= n; num++) {
            System.out.println(num);

        }
    }
}
