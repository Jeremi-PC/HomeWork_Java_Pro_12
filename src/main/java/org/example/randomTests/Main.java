package org.example.randomTests;

import java.util.Random;
public class Main {

    public static int negativeRandomNums(Random rnd) {
        if (rnd == null) {
            throw new IllegalArgumentException("Random object cannot be null");
        }
        int result = rnd.nextInt(-100, 101);
        return result % 2 != 0 ? result : result + 1;
    }
    public static void main(String[] args) {

        System.out.println(negativeRandomNums(new Random()));

    }
}