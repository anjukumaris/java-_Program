package interfaces;

public class Firefox implements Webdriver {
    @Override
    public void launch() {
        System.out.println("Firefox launched");
    }

    @Override
    public void close() {
        System.out.println("Firefox closed");
    }

    @Override
    public void get(String url) {
        System.out.println("Firefox navigated to - "+ url);
    }
}
