package programmingWithJava.Module1;

public class ForwardButtonClass extends CreateAbstractClass implements ButtonPress {
    String forwardTo;
    String message;

    @Override
    public void buttonPress(){
        System.out.println("Forwarding " + this.message + " to " + this.forwardTo);

    }

    @Override
    public void onButtonHover() {
        System.out.println("Hovering over Forward button");
    }

    public void setForwardTo(String forwardTo) {
        this.forwardTo = forwardTo;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
