import java.util.Scanner;

public class Reversenum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();

        int ans = 0;
        while (a > 0){
            int rem = (int) a % 10;
            a /= 10;
            ans = ans * 10 +rem;

        }
        System.out.println(ans);

    }
}
