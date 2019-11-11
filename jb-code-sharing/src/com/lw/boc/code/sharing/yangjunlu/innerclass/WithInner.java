package com.lw.boc.code.sharing.yangjunlu.innerclass;

/**
 * 内部类的继承
 */
class WithInner {
    class Inner{}
}

class InneritInner extends WithInner.Inner{
    InneritInner(WithInner withInner) {
        withInner.super();
    }

    public static void main(String[] args) {
        WithInner withInner = new WithInner();
        InneritInner inneritInner = new InneritInner(withInner);
    }
}
