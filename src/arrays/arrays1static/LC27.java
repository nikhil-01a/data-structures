package arrays.arrays1static;

import java.util.Arrays;

public class LC27 {

    // Given an input array, perform this using in-place algorithm:
    // 1. Remove value 'x' from the array.
    // 2. The values not equal to 'x' should be in the beginning of the array, the rest of the values in the array don't matter.
    // 3. Return the number of values not equal to value 'x'.

    // Solution: Using two pointer
    private int removeElement(int[] arr, int x) {
        int writerPointer = 0;
        for(int readerPointer = 0; readerPointer < arr.length; readerPointer++) {
            if (arr[readerPointer] == x) continue;
            arr[writerPointer++] = arr[readerPointer];
        }
        return writerPointer;
    }


}
