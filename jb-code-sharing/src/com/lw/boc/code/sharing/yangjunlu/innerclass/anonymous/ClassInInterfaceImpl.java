package com.lw.boc.code.sharing.yangjunlu.innerclass.anonymous;

/**
 * 	如果想要创建某些公共代码，使得它们可以被某个接口的所有不同实现共用，那么可以使用接口内部的嵌套类
 */
public class ClassInInterfaceImpl implements ClassInInterface {

	@Override
	public void howdy() {

	}

	public static void main(String[] args) {
		new Test().howdy();
	}
}
