package arrays.arrays1static;

public class LC26 {

    // Remove duplicates from a sorted array in ascending order and return the number of unique elements.
    // We only care about the starting unique elements in the array, the rest of the elements can be anything.
    public int removeDuplicates(int[] arr) {
        // Using Two Pointers approach
        int writerPointer = 1; // 0th element is unique
        for (int readerPointer = 1; readerPointer < arr.length; readerPointer++) {
            if (arr[readerPointer] != arr[readerPointer-1]) arr[writerPointer++] = arr[readerPointer];
        }
        return writerPointer;
    }


}
