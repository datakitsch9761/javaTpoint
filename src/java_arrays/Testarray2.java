package java_arrays;

import static jdk.nashorn.internal.objects.NativeMath.min;

//Java program to demonstrate the way of passing an array to method
 class Testarray2 {
    //creating a method which receieves an array as a parameter
    static void min(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++)
            if (min > arr[i])
                min = arr[i];
        System.out.println(min);
    }

    public static void main(String[] args) {
    int a[] = {10,20,30,40,50};//declaring and initializing an array
    min(a);//passing array to method
    }
}