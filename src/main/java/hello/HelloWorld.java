package src.main.java.hello;

import static org.junit.Assert.*;
import org.junit.Test;
import java.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
      LocalTime currentTime = LocalTime.now();
		  System.out.println("Waktu menunjukan pukul: " + currentTime);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
