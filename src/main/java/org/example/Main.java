package org.example;

import java.util.Random;
public class Main {

    public static int negativeRandomNums (Random rnd) {
        int result;
        do {
            result = rnd.nextInt(-100, 101);
        }
        while (result % 2 == 0);
        return result;
    }
    public static void main(String[] args) {

        System.out.println(negativeRandomNums(new Random()));

    }
}