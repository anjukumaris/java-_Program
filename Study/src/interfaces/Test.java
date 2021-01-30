package interfaces;

public class Test {
    public static void main(String[] args){
        Webdriver chromeDriver = new ChromeDriver();
        Webdriver firefoxDriver = new Firefox();

        chromeDriver.launch();
        chromeDriver.get("http://www.google.com");
        chromeDriver.close();

        firefoxDriver.launch();
        firefoxDriver.get("http://www.google.com");
        firefoxDriver.close();
    }
}
