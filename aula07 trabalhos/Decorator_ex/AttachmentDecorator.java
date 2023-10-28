package Decorator_ex;

public class AttachmentDecorator extends EmailDecorator {
    private String attachment;

    public AttachmentDecorator(Email decoratedEmail, String attachment) {
        super(decoratedEmail);
        this.attachment = attachment;
    }
    
    @Override
	public String getContents() {
		// TODO Auto-generated method stub
		return null;
	}

    @Override
    public void sendEmail() {
    	decoratedEmail.sendEmail();
        System.out.println("Sending attachment: \n" + attachment);
    }

	
}
