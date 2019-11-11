package com.lw.boc.code.sharing.yangjunlu.innerclass;

/**
 * 局部内部类
 *  PDestination类是destination() 方法的一部分，而不是 Parcel5 的一部分。所以，在 destination() 之外不能访问 PDestination。
 *  注意出现在return 语句中的向上转型---- 返回的是 Destination 的引用，它是 PDestination 的基类。当然，在destination()中定义了内部类PDestination，并不意味着一旦 dest() 方法执行完毕，PDestination 就不可用了
 */
public class Parcel5 {
	public Destination destination(String s){
		class PDestination implements Destination{

			private String label;

			private PDestination(String whereTo) {
				label = whereTo;
			}

			@Override
			public String readLable() {
				return label;
			}

		}
		return new PDestination(s);
	}
}
