package Decorator_ex;

public class SignatureDecorator extends EmailDecorator {
    private String signature;

    public SignatureDecorator(Email decoratedEmail, String signature) {
        super(decoratedEmail);
        this.signature = signature;
    }

    @Override
    public String getContents() {
        return decoratedEmail.getContents() + "\n\n" + signature;
    }

}