package Algorithms.Search;

// Description
/*
 * Binary Search is a searching algorithm used in a sorted array by repeatedly dividing the search interval in half.
 * The idea of binary search is to use the information that the array is sorted and reduce the time complexity to O(Log n).
 * Binary Search Algorithm: The basic steps to perform Binary Search are:
 * Begin with an interval covering the whole array.
 * If the value of the search key is less than the item in the middle of the interval,
 * narrow the interval to the lower half.
 * Otherwise, narrow it to the upper half.
 * Repeatedly check until the value is found or the interval is empty.
 */

    // Java implementation of iterative Binary Search
    class BinarySearch {
        // Returns index of x if it is present in arr[],
        // else return -1
        int binarySearch(int arr[], int x)
        {
            int l = 0, r = arr.length - 1;
            while (l <= r) {
                int m = l + (r - l) / 2;

                // Check if x is present at mid
                if (arr[m] == x)
                    return m;

                // If x greater, ignore left half
                if (arr[m] < x)
                    l = m + 1;

                    // If x is smaller, ignore right half
                else
                    r = m - 1;
            }

            // if we reach here, then element was
            // not present
            return -1;
        }

        // Driver method to test above
        public static void main(String args[])
        {
            BinarySearch ob = new BinarySearch();
            int arr[] = { 2, 3, 4, 10, 40 };
            int n = arr.length;
            int x = 10;
            int result = ob.binarySearch(arr, x);
            if (result == -1)
                System.out.println("Element not present");
            else
                System.out.println("Element found at "
                        + "index " + result);
        }
    }
