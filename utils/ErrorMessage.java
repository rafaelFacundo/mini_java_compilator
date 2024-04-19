package utils;

public class ErrorMessage {
    public boolean is_there_a_erro;

    public void showErrorMessage(String errorMessage) {
        this.is_there_a_erro = true;
        System.out.println(errorMessage);
    }
}
