package java_control_statement;

public class IfElseTernaryExample {
    public static void main(String[] args) {
        int number = 20;
        //Using ternary Operator
        String output = (number%2==0)?"Even Number":"Odd Number";
        System.out.println(output);
    }
}
