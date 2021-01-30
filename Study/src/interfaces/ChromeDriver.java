package interfaces;

public class ChromeDriver implements Webdriver {
    @Override
    public void launch() {
        System.out.println("Chrome launched");
    }

    @Override
    public void close() {
        System.out.println("Chrome closed");
    }

    @Override
    public void get(String url) {
        System.out.println("Chrome navigated to - "+ url);
    }
}
