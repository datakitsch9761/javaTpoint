package java_control_statement;

public class SwitchStringExample {
    public static void main(String[] args) {
        //Declaring String Variable
        String levelString = "Expert";
        int level = 0;
        //Using String in Switch expressions
        switch(levelString){
            case "Beginner": level = 1;
            break;
            case "Intermediate": level = 2;
                break;
            case "Expert": level = 3;
                break;
            default: level = 0;
            break;
        }
        System.out.println("Your Level is " + level);
    }
}
