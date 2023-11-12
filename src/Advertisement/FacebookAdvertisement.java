package Advertisement;

public class FacebookAdvertisement implements Advertisement {

    @Override
    public void advertiseMessage(String message) {
        System.out.println("Facebook: " + message);
    }
}
