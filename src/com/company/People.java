package com.company;

import java.util.Objects;

public class People {
    final String name;
    final int passcode;

    public People(String name, int passcode)
    {
        this.name = name;
        this.passcode = passcode;
    }
    public String getName()
    {
        return name;
    }
    public int getPassCode()
    {
        return passcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return Objects.equals(name, people.name) &&
                Objects.equals(passcode, people.passcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, passcode);
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", PassID='" + passcode + '\'' +
                '}';
    }
}



