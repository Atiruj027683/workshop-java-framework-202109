import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class HelloTest {
    @Test
    public void case01() {
        //arrange
        Hello hello = new Hello();

        //act
        String actualResult = hello.sayHi("Atiruj");

        //assert
        assertEquals("Hello, Atiruj",actualResult);

    }

}
