package com.lw.boc.code.sharing.yangjunlu.finaldemo;

/**
 * final 参数
 * 方法f() 和 g() 展示了当基本类型的参数被指明为final时所出现的结果：你可以读取参数，但却无法改变参数
 * 这一特性主要用来向匿名内部类传递数据
 */
class Gizmo{
    public void spin(){}
}

public class FinalArguments {
    void with(final Gizmo gizmo) {
//        gizmo = new Gizmo();  //Illegal -- g is final
    }
    void without(Gizmo gizmo){
        gizmo = new Gizmo();
        gizmo.spin();
    }

//    void f(final int i){i++;}// Can't change You can only read from a final primitive
    void g(final int i){
        System.out.println(i);
        d(i);
    }

    void d(int c){
        System.out.println(c++);
    }

    public static void main(String[] args) {
        FinalArguments f = new FinalArguments();
        f.g(3);
    }
}
