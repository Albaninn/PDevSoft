package Decorator_ex;

public class TextFormattingDecorator extends EmailDecorator {
    private String format;

    public TextFormattingDecorator(Email decoratedEmail, String format) {
        super(decoratedEmail);
        this.format = format;
    }

    @Override
    public String getContents() {
        return decoratedEmail.getContents() + " " + format;
    }

}
