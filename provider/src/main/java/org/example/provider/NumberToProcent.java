package org.example.provider;

import org.example.service.Number;

import java.util.Scanner;

public class NumberToProcent implements Number {
    Scanner sc = new Scanner(System.in);

    @Override
    public Double numberToPercent(Double number) {
        return number / 100;
    }
}
