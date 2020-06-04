package main.java;

public class TestMain2 {
    private static TestMain2 ourInstance = new TestMain2();

    public static TestMain2 getInstance() {
        return ourInstance;
    }

    private TestMain2() {
    }
}
