package java_static_keyword;

//Java Program to demonstrate the use of an instance variable
//Which get memory each time when we create and object of the class

class Counter {
    int count = 0;//Will get memory each time when the instance is created

    Counter(){
        count++;//incrementing value
        System.out.println(count);
    }

    public static void main(String[] args) {
        //creating objects
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}
