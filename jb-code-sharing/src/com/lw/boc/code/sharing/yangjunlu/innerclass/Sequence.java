package com.lw.boc.code.sharing.yangjunlu.innerclass;

import java.util.ArrayList;
import java.util.List;

/**
 * 内部类还拥有其外围类的所有元素的访问权
 * 迭代器设计模式的一个例子
 */
public class Sequence {
	private Object[] items;
	private int next = 0;
	private List<String> a = new ArrayList<>();

	public Sequence(int size) {
		items = new Object[size];
	}

	public void add(Object x) {
		if (next < items.length) {
			items[next++] = x;
		}
	}

	/**
	 * 此类中的三个方法 都用到了Objects，这是一个引用，但这个Objects不属于SequenceSelector的一部分
	 * Objects 这个是一个private的字段，但是SequenceSelector 就跟使用自己的属性一样
	 */
	private class SequenceSelector implements Selector {
		private int i = 0;


		@Override
		public boolean end() {
			return i == items.length;
		}

		@Override
		public Object current() {
			return items[i];
		}

		@Override
		public void next() {
			if (i < items.length) {
				i++;
				a.add(Integer.toString(i));
			}
		}
	}

	public Selector selector() {
		return new SequenceSelector();
	}

	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for (int i = 0; i < 10; i++) {
			sequence.add(Integer.toString(i));
		}
		Selector selector = sequence.selector();
		while (!selector.end()) {
			System.out.println(selector.current() + "");
			selector.next();
		}
	}
}
