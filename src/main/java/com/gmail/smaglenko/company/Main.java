package com.gmail.smaglenko.company;

public class Main {
    public static void main(String[] args) {
        Employee manager = new ProjectManager("Bob", 20);
        Employee programmer = new Programmer("Alise", 30);
        Employee tester = new Tester("Jon", 35);

        programmer.addPosition(Position.MANAGER);
        tester.addPosition(Position.PROGRAMMER);
    }
}
