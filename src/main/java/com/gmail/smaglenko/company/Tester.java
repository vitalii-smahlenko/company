package com.gmail.smaglenko.company;

public class Tester extends Employee {
    public Tester(String name, int age) {
        super(name, age);
        addPosition(Position.TESTER);
    }
}