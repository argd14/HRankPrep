package Exercises;

import java.io.*;
    import java.util.*;

    import static java.util.stream.Collectors.joining;

    class Result3 {
        public static void insertionSort1(int n, List<Integer> arr) {

            for (int i = n-1; i >= 0; --i) {
                int key = arr.get(i);
                int j = i - 1;

                while (j >= 0 && arr.get(j) > key) {
                     arr.set(j+1, arr.get(j));
                    j = j - 1;
                String str = arr.toString().replaceAll("\\[|\\]|,", "").replaceAll(", ",", ");
                System.out.println(str);

                }
                arr.set(j+1, key);

            }
            String str = arr.toString().replaceAll("\\[|\\]|,", "").replaceAll(", ",", ");
            System.out.println(str);

        }
    }

    public class Insertion_Sort_Part_1 {
        public static void main(String[] args) throws IOException {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//            int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                    .map(Integer::parseInt)
//                    .collect(toList());
            ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 3));
//            List<Integer> arr = new ArrayList<>(12, 11, 13, 5, 6);
            Result3.insertionSort1(5,arr2);

//            bufferedReader.close();
        }
    }
