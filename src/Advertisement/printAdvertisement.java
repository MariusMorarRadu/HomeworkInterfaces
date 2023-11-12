package Advertisement;

public class printAdvertisement implements Advertisement{
    @Override
    public void advertiseMessage(String message) {
        System.out.println("print: " + message);
    }
}
