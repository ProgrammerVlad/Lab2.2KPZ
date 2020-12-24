package com.company;

public class Main {

    public static void main(String[] args) {
        People p1 = new People("Fugol", 12345);
        People p2 = new People("Lytvyn", 54321);

        System.out.println(p1.getName());
        System.out.println(p1.getPassCode());
        System.out.println(p1.hashCode());
        System.out.println(p1.equals(p2));
        System.out.println(p2.toString());

    }
}
