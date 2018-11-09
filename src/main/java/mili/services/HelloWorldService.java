package mili.services;

public class HelloWorldService {

    // static stuff

    public static final String serverIP = "1234";

    private static final HelloWorldService service = new HelloWorldService();

    private static String staticGreet = "Hello world";

    public static String staticGreet() {
        service.objectGreet = "I hacked you";
        return staticGreet;
    }

    public static HelloWorldService getService() {
        return new HelloWorldService();
    }

    // Non static stuff

    public HelloWorldService(String objectGreet) {
        this.objectGreet = objectGreet;
    }

    protected HelloWorldService() {

    }

    private String objectGreet = "Hello from Object";

    public String greet(){
        return this.objectGreet;
    }

}
