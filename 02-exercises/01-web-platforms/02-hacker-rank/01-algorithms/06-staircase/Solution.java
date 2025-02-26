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
   * Complete the 'staircase' function below.
   *
   * The function accepts INTEGER n as parameter.
   */

  public static void staircase(int n) {
    String caractere = "#";
    ArrayList<ArrayList<String>> tableCaracteres = new ArrayList<>();

    for (int i = 1; i <= n; i++) {
      ArrayList<String> lineCaracteres = new ArrayList<>();

      for (int c = 1; c <= n - i; c++) {
        lineCaracteres.add(" ");
      }

      for (int c = 1; c <= i; c++) {
        lineCaracteres.add(caractere);
      }

      tableCaracteres.add(lineCaracteres);
    }

    for (ArrayList<String> values : tableCaracteres) {
      for (String value : values) {
        System.out.print(value);
      }
      System.out.println();
    }
  }
}

public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    Result.staircase(n);

    bufferedReader.close();
  }
}
