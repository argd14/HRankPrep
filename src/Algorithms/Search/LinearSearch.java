package Algorithms.Search;

    // Description
    /*
    * Searching Algorithms are designed to check for an element or retrieve an element
    * from any data structure where it is stored. Based on the type of search operation,
    * these algorithms are generally classified into two categories:
    * Sequential Search: In this, the list or array is traversed sequentially and every element is checked.
    * For example: Linear Search.
* */

// Java code for linearly searching x in arr[]. If x
// is present then return its location, otherwise
// return -1

    class LinearSearch
    {
        public static int search(int arr[], int x)
        {
            int n = arr.length;
            for (int i = 0; i < n; i++)
            {
                if (arr[i] == x)
                    return i;
            }
            return -1;
        }

        // Driver code
        public static void main(String args[])
        {
            int arr[] = { 2, 3, 4, 10, 40 };
            int x = 10;

            // Function call
            int result = search(arr, x);
            if (result == -1)
                System.out.print(
                        "Element is not present in array");
            else
                System.out.print("Element is present at index "
                        + result);
        }
    }

