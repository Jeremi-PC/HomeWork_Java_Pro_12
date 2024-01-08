package org.example;
import org.example.randomTests.Main;
import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class RandomNumberGenTest {

    @Test
    public void testNegativeRandomNums() {
        Random rnd = mock(Random.class);
        when(rnd.nextInt(anyInt(),anyInt()))
                .thenReturn(-50);

        int expected = -49;
        int actual = Main.negativeRandomNums(rnd);
        System.out.println(actual);
        assertEquals(expected, actual);
    }
    @Test
    public void testNegativeRandomNumsWithNull() {
       assertThrows(IllegalArgumentException.class, () -> {
            Main.negativeRandomNums(null);
        });
    }
}