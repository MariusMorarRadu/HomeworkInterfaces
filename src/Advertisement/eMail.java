package Advertisement;

public class eMail implements Advertisement{
    @Override
    public void advertiseMessage(String message) {
        System.out.println("eMail: " + message);
    }
}
