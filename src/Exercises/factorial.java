package Exercises;
import java.io.IOException;
// Description
/*
* To obtain the Factorial of a number using recursion
* https://www.youtube.com/watch?v=yX5kR63Dpdw
* */

class factorialClass {
    int result;
    public int factorialMethod(int x){
        if (x>=1){
            result = x * factorialMethod(x-1);
        }else{
            result = 1;
        }
        System.out.println(result);
        return result;
    }
}
public class factorial {
     public static void main(String[] args) throws IOException {
        factorialClass rc= new factorialClass();
        rc.factorialMethod(5);
     }
 }

