package org.example.consumer;

import org.example.service.Number;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.ServiceLoader;

public class Consumer {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Switch();


    }

    private static void Menu(List<Number> getANumber) {
        System.out.println("""
                1.Number to percent.
                2.Percent to Number.
                3.Exit
                """);
    }

    private static void Switch() {
        List<Number> getANumber = new ArrayList<>();
        numberInALoop(getANumber);
        while (true) {
            Menu(getANumber);
            switch (sc.nextLine()) {
                case "1" -> System.out.println(getANumber.get(0).numberToPercent(secondMenu(sc)));
                case "2" -> System.out.println(getANumber.get(1).numberToPercent(secondMenu(sc)));
                case "3" -> System.exit(0);
            }
        }
    }

    private static List<Number> numberInALoop(List<Number> getANumber) {

        ServiceLoader<Number> Numbers = ServiceLoader.load(Number.class);
        for (var number : Numbers) {
            getANumber.add(number);

        }
        return getANumber;
    }

    public static Double secondMenu(Scanner sc) {
        System.out.println("""
                Pick numbers to change to percent.
                """);
        return Double.parseDouble(sc.nextLine());
    }
}
