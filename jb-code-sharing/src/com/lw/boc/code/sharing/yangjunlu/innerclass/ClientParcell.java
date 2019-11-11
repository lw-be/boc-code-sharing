package com.lw.boc.code.sharing.yangjunlu.innerclass;

public class ClientParcell {
	public static void main(String[] args) {
		Parcell parcell = new Parcell();

		//  外部类使用内部类
		Parcell.Contents contents = parcell.getContents();

		// 当需要创建内部类对象时
		Parcell.Contents contents1 = parcell.new Contents();
	}
}
