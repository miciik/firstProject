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
        System.out.println( HelloWorldService.getService().greet() );
        System.out.println( HelloWorldService.staticGreet() );
        System.out.println( HelloWorldService.getService().greet() );
    }
}
