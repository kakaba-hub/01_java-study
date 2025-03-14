package com.ino.section01.polymorphism;

public class Child1 extends Parent {
    private int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Child1() {}

    public Child1(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void  printChild1() {
        System.out.println("i'm first child");
    }

    public String getInformation() {
        return super.getInformation() + "z = " + z;
    }
}
