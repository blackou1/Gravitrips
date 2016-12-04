package com.company;


public enum Chip {
    X("X"),
    O("O"),
    EMPTY(".");

    private String name;

    Chip(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
