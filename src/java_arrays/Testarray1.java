package java_arrays;
//Java program to illustrate to use of declaration, instantiation
//and initialization of Java array in a single line
public class Testarray1 {
    public static void main(String[] args) {
        int a[] = {33,3,4,5};//declration,instantiation and inialization
        int arr[] = {1,2,3,4,5,6,7};//declration,instantiation and inialization

        //print array
        for(int i = 0; i < a.length;i++ )//length is the property of array
            System.out.println(a[i]);

        System.out.println();

        for(int i : arr)
            System.out.println(i);
    }
}
