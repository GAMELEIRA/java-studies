package services;

import java.util.ArrayList;

public class InvalidParametersException extends Exception {

  public InvalidParametersException(String message) {
    super(message);
  }
  
  public static void validateBiggerNumber(ArrayList<Integer> numbers) throws InvalidParametersException {
    Integer oldNumber = numbers.get(0);
    for (Integer number: numbers) {
      if (number < oldNumber) {
        throw new InvalidParametersException("O segundo parâmetro deve ser maior que o primeiro");
      }
    }

  } 

}
