package com.lw.boc.code.sharing.yangjunlu.innerclass;

public class Parcel4 {
	private class PContents implements Contents{

		@Override
		public int value() {
			return 0;
		}
	}

	protected class PDestination implements Destination{

		private String label;

		private PDestination(String whereTo){
			label = whereTo;
		}

		@Override
		public String readLable() {
			return label;
		}
	}

	public Destination destination(String s){
		return new PDestination(s);
	}

	public Contents contents(){
		return new PContents();
	}
}
