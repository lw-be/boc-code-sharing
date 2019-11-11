package com.lw.boc.code.sharing.yangjunlu.innerclass.anonymous;

/**
 * 	匿名内部类
 * 	通过 实例初始化，达到为匿名内部类创建一个构造器的效果
 */
public abstract class Base {
	public Base(int i) {
		System.out.println("Base constructor. i = " + i);
	}

	public abstract void f();
}
