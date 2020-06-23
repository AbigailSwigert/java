class Types {
//    This class has syntax errors, that will prevent your other classes from running.  So... work on this file first to resolve the issues.
    static int number;
    static int[] myArray = {3,4,5,6,76,12,2};
    static String movieA = "Harry and the Hendersons";
    static String movieB = "Star Wars";
    static char male = 'm';
    static char female = 'f';

    static void printArray() {
        System.out.println("The values of int[] myArray are ");
        for (int i: myArray) {
            System.out.println(i);
        }
    }

    //the above instance variables have mistakes with their data types.  Fix the data types so the main method correctly displays the value of all of the variables

    public static void main(String[] args) {
        System.out.println("There are variables that have been declared in this Accessible class.  Fix the code so that all the variables can be accessed by the main method.  print out the values of every variable once the code has been refactored.");
        System.out.println("The value of int number is " + number);
        printArray();
        System.out.println("The value of String movieA is " + movieA);
        System.out.println("The value of String movieB is " + movieB);
        System.out.println("The value of char male is " + male);
        System.out.println("The value of char female is " + female);
    }
}