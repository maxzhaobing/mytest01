package com.type;

public class Main {
    public static void main(String[] args) {
        Building b = new House();
        Class<House> houseClass = House.class;
        House h = houseClass.cast(b);
        h.gh();
        h = (House)b;
        h.gh();

        System.out.println(h instanceof House);
        System.out.println(h instanceof Building);
    }
}
