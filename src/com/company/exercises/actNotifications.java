package com.company.exercises;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.lang.*;

class Result {

    /*
     * Complete the 'activityNotifications' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY expenditure
     *  2. INTEGER d
     */

    public static int activityNotifications(List<Integer> expenditure, int d) {

        int suma = 0;
        double m = 0;
        int not = 0;
        int count = 0;

        if (expenditure.size()%2 != 0) {
            m = 1 + Math.floor(expenditure.size()/2);
        } else {
            m = Math.floor(expenditure.size()/2);
        }

        if ((1 <= expenditure.size()) && expenditure.size() <= 2 * Math.pow(10,5)){
            if (1<= d && d<= expenditure.size()) {
                if (0<=expenditure.size() && expenditure.size()<=200) {

                    for (int i = 0; i < expenditure.size(); i++) {
                        not = expenditure.get(i);
                        suma += expenditure.get(i);

                        for (int j = d+1; j < expenditure.size(); j++) {
                            count += 1;
                            suma -= expenditure.get(count);
                            if ((m*2)<expenditure.get(j)) {
                                not +=1;
                            }
                        }

                    }

                }
            }
        }

        return not;
    }

}

public class actNotifications {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);
//
        int d = Integer.parseInt(firstMultipleInput[1]);
//
        List<Integer> expenditure = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.activityNotifications(expenditure, d);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
//
        bufferedReader.close();
        bufferedWriter.close();
    }
}
