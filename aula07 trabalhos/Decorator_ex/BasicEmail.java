package Decorator_ex;

public class BasicEmail implements Email {
    private String message;

    public BasicEmail(String message) {
        this.message = message;
    }

    @Override
    public String getContents() {
        return message;
    }

    @Override
    public void sendEmail() {
        System.out.println("Sending email: \n\n" + getContents());
    }
}
