class variables {

    // Class variable (static)
    static int classVar = 50;

    // Instance variables
    int instanceVar = 20;
    String name;

    // Constructor
    public variables(String name) {
        this.name = name;
    }

    // Method using local variable and parameter
    public void exampleMethod(int parameter) {

        System.out.println("Name of obj : " + name);
        // Local variable
        int localVar = 10;

        // Accessing local, instance, and class variables
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Class Variable: " + classVar);
        System.out.println("Method Parameter: " + parameter);
        System.out.println("");
    }

    // Method manipulating instance variable
    public void modifyInstanceVariable() {
        instanceVar = 100; // Modifying instance variable
    }

    // Method displaying information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Class Variable: " + classVar);
        //System.out.println("local Variable: " + localVar); it dosen't work in here becaus 
    }

}

public class A1b_variableScope_java {
    public static void main(String[] args) {
        // Creating objects and demonstrating variable types
        variables obj1 = new variables("Object 1");
        variables obj2 = new variables("Object 2");

        // example method starter values
        obj1.exampleMethod(11);
        obj2.exampleMethod(12);

        // Displaying initial information
        System.out.println("Initial information for obj1:");
        obj1.displayInfo();
        System.out.println();

        // Modifying instance variables and demonstrating method calls
        obj1.modifyInstanceVariable();
        // updating class varible value
        obj1.classVar = 200; // Modifying class variable for obj2
                             // variables.classVar = 200;
                             // This is the way to update static variables with <nameOfClass>.<variableName>

        // Displaying updated information
        System.out.println("Updated information for obj1:");
        obj1.displayInfo();

        System.out.println("\nInformation for obj2:");
        obj2.displayInfo();// as you can se class object for obj 2 is also changed but even after updating
                           // instance variable for obj1 it dosent effect obj2
    }
}
