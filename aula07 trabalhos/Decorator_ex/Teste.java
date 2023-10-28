package Decorator_ex;

public class Teste {
    public static void main(String[] args) {
        Email email = new BasicEmail("Bom dia Escobar!");
        email = new TextFormattingDecorator(email, "**");
        email = new SignatureDecorator(email, "- Lucas Albano");
        email = new AttachmentDecorator(email, "image.jpg");
        email.sendEmail();
    }
}
