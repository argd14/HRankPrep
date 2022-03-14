package Exercises;
import java.util.*;

// this is a recursion Exercise

    public class FibonacciNumbers {

        public static int fibonacci(int n) {

            int[] arrFib = new int[2];
            arrFib[0]=0;
            arrFib[1]=1;
            for (int i = 2; i <= n; ++i) {
                arrFib[i % 2] = arrFib[0] + arrFib[1];
            }

            return arrFib[n%2];
        }

        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
            int n = 4;
//            scanner.close();
            System.out.println(fibonacci(n));
        }
    }

