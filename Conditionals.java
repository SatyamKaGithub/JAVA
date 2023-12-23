
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Conditionals {
    public static void main(String[] args) {
        /*
        SYNTAX
        if (boolean statement T or F){
        body
        } else {
        body
        }
        */
        int salary = 1000;
        if (salary > 20000){
            salary = salary + 5000;
        } else if (salary > 10000){
            salary = salary + 2500;
        } else {
            salary += 1500;   // we can use += instead of salary + bonus
        }
        System.out.println(salary);
    }
}