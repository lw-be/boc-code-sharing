package com.lw.boc.code.sharing.yangjunlu.finaldemo;

/**
 * 空 final
 */
class Poppet{
    private int i;
    Poppet(int ii){i = ii;}
}

public class BlankFinal {
    private final int i = 0;
    private final int j; // Blank final
    private final Poppet p;// Blank final reference

    // Blank finals MUST be initialized in the constructor
//    public BlankFinal() {
//        j = i;
//        p = new Poppet(1);
//    }

    public BlankFinal(int x) {
        j = x;
        p = new Poppet(x);
    }

    public static void main(String[] args) {
//        new BlankFinal();
        new BlankFinal(47);
    }
}
