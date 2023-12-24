import java.util.Scanner;

public class Countnums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        int a = input.nextInt();

        int count = 0;
        while (n > 0){
            int rem = (int) n % 10;
            if (rem == a){
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
