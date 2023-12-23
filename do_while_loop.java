public class do_while_loop {
    public static void main(String[] args) {
        /*
        syntax - do-while loop

        do {
        body
        } while(condition);
         */
//        int n = 1;
//        do {
//            System.out.println("Thala for a Reason");
//            n++;
//        } while(n <= 7);
// only difference between a while and do while loop is that do while loop will run at least
// 1 time no matter what the condition is after that ony it will consider the while condition
// Example

        int num = 1;
        do {
            System.out.println("Thala  for a reason");
        } while (num != 1); // here the condition is not allowing to run even 1 time
        // beacause the first iteration is false but still it will print the output 1 time.
    }
}