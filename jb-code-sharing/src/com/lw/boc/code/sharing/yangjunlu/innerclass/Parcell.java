package com.lw.boc.code.sharing.yangjunlu.innerclass;

/**
 * 内部类
 */
public class Parcell {

	private static int c = 3;

	class Contents {

	}

	class Destination{
		private String label;

		Destination(String whereTo) {
			label = whereTo;
		}
		String readLabel(){
			return label;
		}
	}
	public void ship(String dest){
		Contents c = new Contents();
		Destination d = new Destination(dest);
		System.out.println(d.readLabel());
	}

	public Contents getContents(){
		return new Contents();
	}

	public Destination getDestination(String s){
		return new Destination(s);
	}
}
