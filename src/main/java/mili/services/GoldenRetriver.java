package mili.services;

public class GoldenRetriver extends Dog {

    public GoldenRetriver () {
        super("gold");
    }

    protected void grow() {
        System.out.println("I am growing!");
    }

    public String toString() {
        return "This is a golden retriever at " + this.hashCode();
    }

}
