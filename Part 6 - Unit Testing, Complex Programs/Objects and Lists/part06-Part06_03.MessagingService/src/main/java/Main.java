
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message message = new Message("Tom", "Hello");
        System.out.println(message);
        
        MessagingService messages = new MessagingService();
        
        messages.add(message);
        System.out.println(messages.getMessages());;
    }
}
