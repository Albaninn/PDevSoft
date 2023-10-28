package Decorator_ex;

public abstract class EmailDecorator implements Email {
    protected Email decoratedEmail;

    public EmailDecorator(Email decoratedEmail) {
        this.decoratedEmail = decoratedEmail;
    }
    
    @Override
    public void sendEmail() {
        System.out.println("Sending email: \n" + getContents());
    }
}
