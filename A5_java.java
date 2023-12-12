//string 

public class A5_java {

   public static void main(String[] args) {
      // String name = "Harry";
      // // Printing the value of the 'name' string
      // System.out.println(name);

      // // Getting the length of the 'name' string
      // int value = name.length();
      // System.out.println(value);

      // // Converting 'name' string to lowercase
      // String lstring = name.toLowerCase();
      // System.out.println(lstring);

      // // Converting 'name' string to uppercase
      // String ustring = name.toUpperCase();
      // System.out.println(ustring);

      // // Creating a string with leading and trailing spaces
      // String nonTrimmedString = " Harry ";
      // System.out.println(nonTrimmedString);

      // // Removing leading and trailing spaces from a string
      // String trimmedString = nonTrimmedString.trim();
      // System.out.println(trimmedString);

      // // Printing a substring starting from index 1 to the end of the 'name' string
      // System.out.println(name.substring(1));

      // // Printing a substring from index 1 to index 4 (exclusive) of the 'name'
      // string
      // System.out.println(name.substring(1, 5));

      // // Replacing 'r' with 'p' in the 'name' string
      // System.out.println(name.replace('r', 'p'));

      // // Replacing occurrences of "r" with "ier" in the 'name' string
      // System.out.println(name.replace("r", "ier"));

      // // Checking if the 'name' string starts with "Har"
      // System.out.println(name.startsWith("Har"));

      // // Checking if the 'name' string ends with "dd"
      // System.out.println(name.endsWith("dd"));

      // // Getting the character at index 4 of the 'name' string
      // System.out.println(name.charAt(4));

      // String modifiedName = "Harryrryrry";
      // // Finding the index of the first occurrence of "rry" in the 'modifiedName'
      // string
      // System.out.println(modifiedName.indexOf("rry"));

      // // Finding the index of "rry" in the 'modifiedName' string after index 4
      // System.out.println(modifiedName.indexOf("rry", 4));

      // // Finding the last index of "rry" in the 'modifiedName' string before index
      // 7
      // System.out.println(modifiedName.lastIndexOf("rry", 7));

      // // Checking if the 'name' string is equal to "Harry"
      // System.out.println(name.equals("Harry"));

      // // Checking if the 'name' string is equal to "HarRY" (case-insensitive
      // comparison)
      // System.out.println(name.equalsIgnoreCase("HarRY"));

      // // Printing a string with an escape sequence (\t) and a double quote (\")
      // System.out.println("I am escape sequence\tdouble quote");



      //to call the string bulider function in other class name buff
      buff obj = new buff();
      obj.builder();

   }
}

class buff {
   void builder() {
      StringBuilder sb = new StringBuilder("Apna College");
      System.out.println(sb);
      // Get Char
      System.out.println(sb.charAt(0));

      // //Set Char
      // sb.setCharAt(0, 'P');
      // System.out.println(sb);

      // // insert char at
      // sb.insert(0, "P");
      // System.out.println(sb);

      // // delete char
      // sb.delete(0, 1);
      // System.out.println(sb);

      // //append char
      // sb.append(" Stark");//Append means to add something at the end.
      // System.out.println(sb);

      // length
      // System.out.println(sb.length());

      // string buffer
      // StringBuilder for better performance in a single-threaded scenario and
      // StringBuffer for thread safety in a multi-threaded environment.
      // except this everthing is similar
   }
}
