package java_arrays;
//Java Program to demonstrate the way of passing an annonymous array to method

public class TestAnonmyousArray {
    static void printArray(int arr[]){
        for(int i =0;i < arr.length;i++)
            System.out.println(arr[i]);
    }
    public static void main(String[] args) {
     printArray(new int[]{10,22,44,66});//passing annonymous array to method
    }

}
