package arrays.arrays1static;

public class StaticArrays {

    // Insert a value at the end
    public void insertEnd(int[] arr, int value, int valuesFilled) {
        int length = arr.length; // Simply gives total elements in the array.
        if (valuesFilled < length) {
            arr[valuesFilled] = value; // index starts from 0 so no need to add (+ 1) for the next index.
        }
    }

    // Remove a value from the end
    public void removeEnd(int[] arr, int valuesFilled) {
        if (valuesFilled > 0) {
            arr[valuesFilled - 1] = 0;
            valuesFilled--;
        }
    }

    // Insert a value in the middle
    // Assuming array is not already full
    // Just shift all to right by 1 and assign value to index
    public void insertMiddle(int[] arr, int value, int insertIndex, int valuesFilled) {
        if (insertIndex >= 0 && insertIndex < arr.length) {
            for (int i = valuesFilled - 1; i >= insertIndex; i--) arr[i + 1] = arr[i];
            arr[insertIndex] = value;
        }
    }

    // Remove a value from the middle
    // Just shift all to left by 1
    public void removeMiddle(int[] arr, int removeIndex, int valuesFilled) {
        if (removeIndex >= 0 && removeIndex < arr.length) {
            for (int i = removeIndex + 1; i <= valuesFilled - 1; i++) arr[i - 1] = arr[i];
        }
    }

    public void printArray(int[] arr, int valuesFilled) {
        for (int i = 0; i < valuesFilled; i++) System.out.println(arr[i]+" ");
    }

    public static void main(String[] args) {
        StaticArrays staticArrays = new StaticArrays();

        int[] array1 = new int[5];

        // Insert End
        System.out.println("Array Before InsertEnd: ");
        staticArrays.printArray(array1, 0);
        staticArrays.insertEnd(array1, 3, 0);
        System.out.println("Array After InsertEnd: ");
        staticArrays.printArray(array1, 1);

        // Remove End
        System.out.println("Array Before RemoveEnd: ");
        staticArrays.printArray(array1, 1);
        staticArrays.removeEnd(array1,  1);
        System.out.println("Array After RemoveEnd: ");
        staticArrays.printArray(array1, 0);

        int[] array2 = {3, 5, 6, 7, 12, 0};

        // Insert Middle
        System.out.println("Array Before InsertMiddle: ");
        staticArrays.printArray(array2, 5);
        staticArrays.insertMiddle(array2, 345, 3, 5);
        System.out.println("Array After InsertMiddle: ");
        staticArrays.printArray(array2, 6);

        // Remove Middle
        System.out.println("Array Before RemoveMiddle: ");
        staticArrays.printArray(array2, 6);
        staticArrays.removeMiddle(array2, 5, 6);
        System.out.println("Array After RemoveMiddle: ");
        staticArrays.printArray(array2, 5);
    }

    /*
        COMPILE AND RUN:

        1. Simple =
        Compile: javac Main.java
        Run: java Main

        2. With Packages =
        Go to src directory: cd src/
        Compile: javac arrays/arrays1static/StaticArrays.java
        Run: java arrays.arrays1static/StaticArrays

        3. With Packages & Out Directory =
        Compile into output dir: javac -d out arrays/arrays1static/StaticArrays.java
        Run from project root with full name: java -cp out arrays.arrays1static/StaticArrays

        4. Create and Run a runnable jar =
        When classes are in out/: jar --create --file app.jar -C out .
                                  java -jar app.jar
        Or use classpath: java -cp app.jar com.example.app.Main
     */

}
