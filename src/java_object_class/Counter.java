package java_object_class;
//Java program to demonstrate the use of an instance variable
//Which get memory each time when we create an object of the class
//
//

class Counter {
    int count = 0; //will get memory each time when the instance is created

    Counter(){
        count++;//incremental value
        System.out.println(count);
    }

    public static void main(String[] args) {
        //Creating objects
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}
