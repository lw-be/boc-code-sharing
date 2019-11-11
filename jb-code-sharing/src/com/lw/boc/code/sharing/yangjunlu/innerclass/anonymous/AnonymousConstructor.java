package com.lw.boc.code.sharing.yangjunlu.innerclass.anonymous;

/**
 * 	匿名内部类
 * 	通过 实例初始化，达到为匿名内部类创建一个构造器的效果
 * 	此处的 变量i 并不要求是 final 类型的  因为i被传递给匿名内部类的基类的构造器，它并不会在匿名内部类内部被直接使用
 *
 * 	此处需要注意，这样实现的话  需要使用的是 abstract 抽象类 不能使用 interface
 */
public class AnonymousConstructor {
	public static Base getBase(int i) {
		return new Base(i) {

			{
				System.out.println("Inside instance initializer...");
			}

			@Override
			public void f() {
				System.out.println("In anonymous f()");
			}
		};
	}

	public static void main(String[] args) {
		Base base = getBase(47);
		base.f();
	}
}
