package com.gmail.smaglenko.company;

import java.util.List;

public class Employee extends Person {
    private double salary;
    private List<Position> positions;

    public double getSalary() {
        return salary;
    }
}