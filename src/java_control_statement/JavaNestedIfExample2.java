package java_control_statement;

public class JavaNestedIfExample2 {
    public static void main(String[] args) {
        //creating two variables age and weight
        int age = 19;
        int weight = 45;

        //applying condition on age and weight
        if(age > 18){
            if (weight >50){
                System.out.println("You are eligible to donate blood");
            } else{
                System.out.println("You are not eligible to donate blood");
            }
        } else{
            System.out.println("Age must be greater than 18");
        }
    }
}
