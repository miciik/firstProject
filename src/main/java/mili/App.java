package mili;

import mili.services.HelloWorldService;

/**
 * Hello world!
 *
 */
public class App extends HelloWorldService
{
    private static HelloWorldService testField = new HelloWorldService("Zdravo");

    private String appGreet() {
        return this.greet();
    }

    public App() {
        //super("abc");
    }

    public static void main( String[] args )
    {
        HelloWorldService service = HelloWorldService.getService();
        System.out.println( service.greet() );
        System.out.println( HelloWorldService.staticGreet() );
        service = HelloWorldService.getService();
        System.out.println( service.greet() );
        System.out.println( testField.greet() );
    }
}
