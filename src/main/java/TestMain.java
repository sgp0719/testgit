package main.java;

public class TestMain {
    private static TestMain ourInstance = new TestMain();

    public static TestMain getInstance() {
        return ourInstance;
    }

    private TestMain() {
    }
}
