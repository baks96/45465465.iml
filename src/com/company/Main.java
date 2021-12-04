package com.company;


import java.util.ArrayList;
import java.util.PrimitiveIterator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(result(4, 44));
        System.out.println(result(50, 4));
        System.out.println(result(22, 45));
        System.out.println(result(56, 4));
        System.out.println(result(8, 56));



    }

    public static String result(int age, int temperature) {
        if ((age > 0 && age < 45) && (temperature > -20 && temperature > 40)) {
            System.out.println("Можно идти гулять");
        } else if ((age < 20) && (temperature > 0 && temperature < 25)) {
            System.out.println("Можно идти гулять");
        } else if ((age < 45) && (temperature > -10 && temperature < 25)) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Оставайся дома");
        }

        return age + " " + temperature;
    }
}
final class IntRandomNumberGenerator {

    private PrimitiveIterator.OfInt randomIterator;


    public IntRandomNumberGenerator(int min, int max) {
        randomIterator = new Random().ints(min, max + 1).iterator();
    }

    public int nextInt() {
        return randomIterator.nextInt();
    }


    }






