package programmingWithJava;

public class SendButtonClass extends CreateAbstractClass implements ButtonPress {
        String sendTo;
        String message;

        @Override
        public void buttonPress() {
            System.out.println("Sending " + this.message + " to " + this.sendTo);
        }

        @Override
        public void onButtonHover() {
            System.out.println("Hovering over Send button");
        }

        public void setSendTo(String sendTo) {
            this.sendTo = sendTo;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

