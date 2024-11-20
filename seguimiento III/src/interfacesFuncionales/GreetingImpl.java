package interfacesFuncionales;

public class GreetingImpl implements Greeting{
    @Override
    public void sayHello(String name) {
        System.out.println("¡Hola, " + name + "!");
    }
}

