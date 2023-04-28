package org.example.provider;

import org.example.service.Number;

import java.util.Scanner;

public class ProcentToNumber implements Number {
    @Override
    public Double numberToPercent(Double number) {
        return number * 100;
    }
}
