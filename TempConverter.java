import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give temperature in celcius : ");
        double tempC = input.nextFloat();
        double tempF = (tempC * 1.8) + 32;
        System.out.println(tempF);
        if (tempF < 92){
            System.out.println("Not so Hot");
        } else {
            System.out.println("Hot");
        }
    }
}
