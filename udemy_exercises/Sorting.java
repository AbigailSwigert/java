import java.util.Arrays;
import java.util.Scanner;

class Sorting {
    private static Scanner scanner = new Scanner(System.in);

    private static int[] sortIntegers(int[] nums) {
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int i=0; i<sortedNums.length-1; i++) {
                if(sortedNums[i]<sortedNums[i+1]) {
                    temp = sortedNums[i];
                    sortedNums[i] = sortedNums[i+1];
                    sortedNums[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedNums;
    }

    private static void printNums(int[] nums) {
        System.out.println("Array: " + Arrays.toString(nums));
    }

    private static int[] getNums(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for(int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static void reverse(int[] numbers) {
        int maxIndex = numbers.length - 1;
        int halfLength = numbers.length / 2;
        for(int i=0; i<halfLength; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[maxIndex - i];
            numbers[maxIndex - i] = temp;
        }
    }

    public static void main(String[] args) {
        int [] myIntegers = getNums(5);
        int [] sortedNums = sortIntegers(myIntegers);
        System.out.println("Imput order:");
        printNums(myIntegers);
        System.out.println("Descending order:");
        printNums(sortedNums);
        reverse(myIntegers);
        System.out.println("Reversed:");
        printNums(myIntegers);
    }

}
