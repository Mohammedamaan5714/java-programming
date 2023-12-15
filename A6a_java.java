//array
//single dimentional array or one d array
public class A6a_java {
    public static void main(String[] args) {
        // to define an array we use []
        // syntaxx
        // -- type var-name[];
        // -- type[] var-name;
        // and decalre a variable to store a set of values that we store using array
        int a[];
        // in [] we can also declare the size of an array
        // int[] b;

        // Instantiation of an Array
        // arrayRefVar=new datatype[size];

        // allocating memory to array
        a = new int[10];
        // if you initialize an array without specifying its size, it will be treated as
        // an array initializer, and the size will be automatically determined by the
        // number of elements you provide in the initialization. and if you know the
        // how much the size is so the best way is to intialize the size

        // adding the values
        int[] c = { 10, 20, 30 }; // it uses when you first initalize it

        // and if you already initialize it you have to use its index to assign the
        // values
        a[0] = 11;
        a[1] = 22;
        a[2] = 33;
        a[3] = 44;

        // a[30]=44; // it is showing the error cause it is out of the bound area

        // update and element--------------------------------------------------------
        System.out.println("first the element is " + a[0]);
        a[0] = 10;
        System.out.println("after updation " + a[0] + "\n");

        // array proeperties-----------------------------------------------------------

        // to find length we use
        // <varname>.length----------------------------------------
        System.out.println("length of an array 'a' using length func " + a.length);
        // Outputs 4
        System.out.println("length of an array 'c' using length func " + c.length);
        // output 3

        // to accessing all the elements of the
        // array---------------------------------------
        System.out.println("\nelements print by for loop");
        for (int i = 0; i < a.length; i++)
            System.out.println("Element at index " + i + " : " + a[i]);
        System.out.println("");

        // it prints all the values of array

        // Complexity of the above method:
        // Time Complexity: O(n)
        // Auxiliary Space: O(1)

        // Enhanced for Loop (for-each loop)------------------------------------------
        System.out.println("\nthe elements print by for each loop");
        for (int num : c) {
            // Accessing and working with each element of the array

            System.out.println("elemnts" + " : " + num);
            // output is
            // elemnts : 10
            // elemnts : 20
            // elemnts : 30
        }

        // passing anonymous array to a method----------------------------------
        // creating object from anonymous class
        // TestAnonymousArray test =new TestAnonymousArray();
        // If you don't use the static defing function of calss the or the static
        // keyword for the method, it becomes an "instance method". An instance method
        // operates on an instance of the class and can access instance variables and
        // other instance methods directly. To use an instance method, you'll need to
        // create an object (instance) of the class and then call the method using that
        // object.
        // now the mehtod is static so we can call them just by using ->
        // <className>.<method()>;
        TestAnonymousArray.printArray(new int[] { 10, 22, 44, 66 });// passing anonymous array to method

        // to get the array form another anonymous method and then print it-----------------------------
        // calling method which returns an array
        System.out.println("\nprinting the anonymous values giving by a method");
        int arry[] = TestAnonymousArray.get();// form line 128
        // printing the values of an array
        for (int i = 0; i < arry.length; i++)
            System.out.println("elements: " + arry[i]);


        // Array bound exception--------------------------------
        // Java Program to demonstrate the case of
        // ArrayIndexOutOfBoundsException in a Java Array.
        System.out.println("\nexception bound array");
        int arr[] = { 50, 60, 70, 80 };
        for (int i = 0; i <= arr.length; i++) {
            System.out.println("he given elements are " + arr[i]);
        }
        // The arr.length for this array is 4, which means the valid indexes are 0, 1,
        // 2, and 3. But when i becomes 4 (as the loop condition is i <= arr.length),
        // arr[4] is accessed in the loop, which is out of the array bounds. This leads
        // to an ArrayIndexOutOfBoundsException.
        // after this nothing will be executed because of exception error
    }
}

// Java Program to demonstrate the way of passing an anonymous array
// to method.
class TestAnonymousArray {


    // creating a method which receives an array as a parameter
    static void printArray(int arr[]) {
        System.out.println("\nthe elements pass using anonymus array are");
        for (int i = 0; i < arr.length; i++)
            System.out.println("elements -> " + arr[i]);
    }


    // another array giving an anonomus values
    // Returning Array from the Method
    static int[] get() {
        return new int[] { 10, 30, 50, 90, 60 };
    }


}
