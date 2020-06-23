//const nums = [10,23,3,4,5,2,1];
//const greetings = ["hello","howdy","hallo","hola","bonjour","ciao","أهلا"];
//const binaries = [0,1,1,1,0,0,0,1,1,1,1,1,0,1,0,0,1,0];
//nums.forEach(n => console.log(n));
//greetings.forEach(g => console.log(g));
//binaries.forEach(b => console.log(!!b));

import java.util.ArrayList;

class Arrays {
    //Take the arrays.js file, and refactor the code into Java in this file.
    static int[] nums = {10, 23, 3, 4, 5, 2, 1};
    static String[] greetings = {"hello", "howdy", "hallo", "hola", "bonjour", "ciao", "أهلا"};
    static int[] binaryInts = {0,1,1,1,0,0,0,1,1,1,1,1,0,1,0,0,1,0};
    static ArrayList<Boolean> binaries = new ArrayList<Boolean>();

    private static void printNums() {
        for (int n: nums) {
            System.out.println(n);
        }
    };
    private static void printGreetings() {
        for (String g: greetings) {
            System.out.println(g);
        }
    };
    private static void printBinaries() {
        for (int i: binaryInts) {
            if ( i == 0) {
                binaries.add(false);
            } else if ( i == 1) {
                binaries.add(true);
            }
        }
        for (boolean b: binaries) {
            System.out.println(b);
        }
    };

    public static void main(String[] args) {
        printNums();
        printGreetings();
        printBinaries();
    }
}







