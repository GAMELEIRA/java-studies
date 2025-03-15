public class CustomException extends Exception {
  public CustomException(String message) {
    super(message);
  }

  public static void validateNumber(String number) throws CustomException {
    if (number.length() > 12) {
      throw new CustomException("Número de telefone inválido: excede 12 caracteres.");
    }
  }
}
