package java_control_statement;

public class BreakDoWhileExample {
    public static void main(String[] args) {
        //declaring variable
        int i =1;
        //do-while loop
        do {
            if(i==5){
                //using break statements
                i++;
                break;
            }
            System.out.println(i);
            i++;
        }while(i<=10);
    }
}
