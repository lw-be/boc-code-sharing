package com.lw.boc.code.sharing.yangjunlu.innerclass.anonymous;

import com.lw.boc.code.sharing.yangjunlu.innerclass.Contents;

/**
 * 匿名内部类的创建
 * 创建一个继承自Contents的匿名内部类的对象
 * 通过 new 表达式返回的引用被自动向上转型为对 Contents的引用
 */
public class Parcel7 {

	private final int text = 100903;

	public Contents contents() {
		return new Contents() {
			private int i = 11;

			@Override
			public int value() {
				return text + i;
			}
		};
	}

	public static void main(String[] args) {
		Parcel7 p = new Parcel7();
		Contents contents = p.contents();
	}
}
