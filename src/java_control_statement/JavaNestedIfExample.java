package java_control_statement;

public class JavaNestedIfExample {
    public static void main(String[] args) {
        // creating two variables for age and weight
        int age = 20;
        int weight = 80;

        // applying condition on age and weight
        if(age >= 18){
            if(weight > 50){
                System.out.println("You are eligible to donate blood");
            }
        }
    }
}
