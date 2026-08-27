package programmingWithJava.Module1;


public class Main {
    static void main(String[] args) {
        SendButtonClass sendButton = new SendButtonClass();
        sendButton.SetCaption("Send");
        sendButton.setSendTo("user@example.com");
        sendButton.setMessage("You have been registered successfully");
        sendButton.buttonPress();
        sendButton.onButtonHover();

        ForwardButtonClass forwardButton = new ForwardButtonClass();
        forwardButton.SetCaption("Forward");
        forwardButton.setForwardTo("x@y.com");
        forwardButton.setMessage("Hello World");
        forwardButton.buttonPress();
        forwardButton.onButtonHover();
    }
}
