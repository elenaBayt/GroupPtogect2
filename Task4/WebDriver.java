package com.company.groupProject.Task4;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface RemoteWebDriver extends WebDriver {
    void navigate();
}
interface TakesScreenShot extends RemoteWebDriver {
    void getScreenshot();
}
class ChromeDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Chrome Driver opens browser");
    }

    @Override
    public void close() {
        System.out.println("Chrome Driver closes browser");
    }

    @Override
    public String getTitle() {
        String title = null;
        return title;
    }

    @Override
    public void navigate() {
        System.out.println("Chrome Driver navigates throw browser");
    }
}
class FirefoxDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Firefox Driver opens browser");
    }

    @Override
    public void close() {
        System.out.println("Firefox Driver closes browser");
    }

    @Override
    public String getTitle() {
        String title = null;
        return title;
    }

    @Override
    public void navigate() {
        System.out.println("Firefox Driver navigates throw browser");
    }
}
class SafariDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Safari Driver opens browser");
    }

    @Override
    public void close() {
        System.out.println("Safari Driver closes browser");
    }

    @Override
    public String getTitle() {
        String title = null;
        return title;
    }

    @Override
    public void navigate() {
        System.out.println("Safari Driver navigates throw browser");
    }
}
