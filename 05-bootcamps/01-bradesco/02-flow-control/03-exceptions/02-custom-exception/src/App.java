public class App {
    public static void main(String[] args) throws Exception {
        String phoneNumber = "119567343";

        try {
            CustomException.validateNumber(phoneNumber);
            System.out.println("Número válido!");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

    }

}
