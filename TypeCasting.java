// Condition 1 - Two types should be compatible
// Condition 2 - Destination type should be greater than the source type

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Float num = input.nextFloat(); // this will work perfectly fine if we give integer value
//        int num = input.nextInt();  //  this will give error if we try to give float

        // compressing a bigger type into smaller type is TypeCasting
//        int num = (int)(67.67f);
//        System.out.println(num);

        // Automatic type promotion in expression
//        int a = 257;
//        byte b = (byte)(a); // 257 % 256 = 1
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a*b/c; // This expression is performed using integer not bytes cause bytes have only 256 space and a*b=2000
//        System.out.println(d);


//        int number = 'A';
//        System.out.println(number);  // unicode

        byte b = 42;
        int i = 50000;
        char c = 'a';
        short s = 1024;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) +" "+ (i / c) +" "+ (d - s));
        System.out.println(result);

    }
}
// conversion takes place by priority level all the types will convert into higher data types
// ex - float + int + double = double





