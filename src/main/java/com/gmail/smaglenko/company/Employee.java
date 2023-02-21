package com.gmail.smaglenko.company;

import java.util.ArrayList;
import java.util.List;

public class Employee extends Person {
    private String name;
    private List<Position> positions;

    public Employee(String name, int age) {
        super(name, age);
        positions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void addPosition(Position position) {
        positions.add(position);
    }

    public void removePosition(Position position) {
        positions.remove(position);
    }
}