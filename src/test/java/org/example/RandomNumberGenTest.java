package org.example;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

class RandomNumberGenTest {

    @Test
    void negativeRandomNums() {
        Random rnd = Mockito.mock(Random.class);
        Mockito.when(rnd.nextInt()).thenReturn(-5, 6);
        int expected = -5;
        int actual = Main.negativeRandomNums(rnd);
        assertEquals(expected, actual);

    }
}