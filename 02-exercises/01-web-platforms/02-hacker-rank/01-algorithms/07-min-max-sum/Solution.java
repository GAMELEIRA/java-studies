import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        ArrayList<Long> minNumbers = new ArrayList<Long>();
        ArrayList<Long> maxNumbers = new ArrayList<Long>();
        long maxNumber = arr.get(0);
        long minNumber = arr.get(0);
        long sumMaxNumbers = 0L;
        long sumMinNumbers = 0L;
        
        for (Integer number: arr) {
            if (maxNumber < number) {
                maxNumber = number;
            } 
            
            if (minNumber > number) {
                minNumber = number;
            }
        }
        
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < maxNumber) {
             minNumbers.add((long) arr.get(i));
            } 
            
            if (arr.get(i) > minNumber) {
             maxNumbers.add((long) arr.get(i));
            }
            
            if (arr.get(i) == minNumber) {
             minNumbers.add((long) arr.get(i));
             maxNumbers.add((long) arr.get(i));
            }
        
        for (Long number: maxNumbers) {
            sumMaxNumbers += number;
        }
        
        for (Long number: minNumbers) {
            sumMinNumbers += number;
        }

        System.out.printf("%d %d", sumMinNumbers, sumMaxNumbers);
    }

}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
