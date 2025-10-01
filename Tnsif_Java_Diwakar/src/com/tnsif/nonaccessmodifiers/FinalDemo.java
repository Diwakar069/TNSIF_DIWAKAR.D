package com.tnsif.nonaccessmodifiers;

class FinalDemo {

    final int Var = 100;

    void display() {
        System.out.println("show the value of Var: " + Var);
    }

    public static void main(String[] args) {
        FinalDemo fd = new FinalDemo();
        fd.display();
        // fd.Var = 200; // ❌ Not allowed since Var is final
    }
}

class Child extends FinalDemo {
    @Override
    void display() {
        System.out.println("Overridden display, Var = " + Var);
    }
}
