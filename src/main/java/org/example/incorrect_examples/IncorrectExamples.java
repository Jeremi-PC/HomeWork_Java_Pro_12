package org.example.incorrect_examples;


import com.github.javafaker.Faker;

// Напишите примеры классов/интерфейсов/отдельных методов с нарушением изученных лучших практик
// (4-5 нарушений). В комментариях, начинающихся с
// TO-DO,  укажите, какой принцип был нарушен.
//  Получившийся проект направьте на проверку.
public class IncorrectExamples {
    // Single responsibility principle
    public static double calculateFigureSquare(int a, int b) {
        double sqr;
        if (b == 0) {
            sqr = a * a * Math.PI;
        } else {
            sqr = a * b;
        }
        return sqr;
        //TODO split one method to different methods, for calculate exactly needed values
    }

    public static void princepleYagni(String name) {
        //  YAGNI principle
        Faker faker = new Faker();
        name = faker.name().firstName();
        if (true) {
            System.out.println("Chosen name is: " + name);
        }
        //TODO remove Library FAKER, for use input arguments
    }

    public static int princepleKiss(String str, Double num) {
        //Kiss principle
        if (!str.isEmpty() && !Double.isNaN(num)) {
            try {
                int tempResult = Integer.parseInt(str);
                int tempResult2 = num.intValue();
                return tempResult + tempResult2;
            } catch (NumberFormatException e) {
                throw new NullPointerException("Cannot process this values");
            }
        } else {
            throw new RuntimeException();
        }
        //TODO can use a actual integer input arguments, for calculating sum;

    }

    public static int getNumberFromString(String str) {
        //POLA principle
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("String doesnt contain nums values");
        }
        //TODO this is impossible action, name of this method doesnt match its action
    }


    public static void main(String[] args) {
        System.out.println("Circle Square = " + calculateFigureSquare(15, 0));
        System.out.println("Rectangle Square = " + calculateFigureSquare(15, 15));
        princepleYagni("Name");
        System.out.println(princepleKiss("5", 45.0));
        System.out.println(getNumberFromString("Hello"));
    }
}

