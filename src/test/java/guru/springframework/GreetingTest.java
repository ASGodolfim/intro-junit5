package guru.springframework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingTest {

    Greeting greeting;
    @BeforeEach
    void setUp() {
        System.out.println("In Before Each...");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        greeting = new Greeting();

        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
       greeting = new Greeting();

        System.out.println(greeting.helloWorld("Arthur"));

    }
}