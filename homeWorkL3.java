package Lesson3;

public class homeWorkL3 {

    public static void main(String[] args) {
        int[] array1 = {1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0};
        printArray1("1. Before:\t", array1);
        change(array1);
        printArray1("1. After:\t", array1);

        System.out.println("_________________________________");

        int[] array2 = new int[100];
        fillIn(array2);
        printArray1("2. Filled with cycle:\t", array2);

        System.out.println("_________________________________");

        int[] array3 = {2, 4, 2, 6, 12, 8, 5, 9, 1, 3 };
        printArray1( "3. Before:\t", array3);
        doubling(array3);
        printArray1( "3. After:\t", array3);

        System.out.println("_________________________________");

        int side = 10;
        int [][] array4 = new int[side][side];
        crossFill(array4);
        printArray2(msg: "4. Result fill diagonals", array4);

        System.out.println("_________________________________");

        int[] returnArrayFromMethod = returnArray(10, initValue: 999);
        printArray1("5. Array From Method", returnArrayFromMethod);

        System.out.println("_________________________________");

    }



    public static void printArray1(String msg, int[] inputArray) {
        System.out.print(msg + ": ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
            }

    public static void printArray2(String msg, int[][] inputArray) {
        System.out.print(msg);
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++);
        }
        {
            System.out.print(inputArray[i][j] + " ");
        }
        System.out.print();

    public static void change(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        System.out.print();
    }
    public static void fillIn(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = i + 1;
    }

    public static void doubling(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6)
                array[i] *= 2;
    }

    public static void crossFill(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }
    }

    public static int[] returnArray(int len. int initValue) {
        int[] tempArray = new int[len];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = initValue;
    }
        return tempArray;

    }
}