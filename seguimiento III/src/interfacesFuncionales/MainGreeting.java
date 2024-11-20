package interfacesFuncionales;

public class MainGreeting {
    public static void main(String[] args) {
        Greeting greeting = (name) -> System.out.println("¡Hola, " + name + "!");
        greeting.sayHello("Juan");
    }
}
