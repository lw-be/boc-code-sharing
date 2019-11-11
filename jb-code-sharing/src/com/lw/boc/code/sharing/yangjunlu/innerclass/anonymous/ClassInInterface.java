package com.lw.boc.code.sharing.yangjunlu.innerclass.anonymous;

/**
 * 	接口中创建 嵌套类
 * 	如果想要创建某些公共代码，使得它们可以被某个接口的所有不同实现共用，那么可以使用接口内部的嵌套类
 */
public interface ClassInInterface {

	void howdy();

	class Test implements ClassInInterface{

		@Override
		public void howdy() {
			System.out.println("howdy");
		}

		public static void main(String[] args) {
			new Test().howdy();
		}
	}

}
