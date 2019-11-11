package com.lw.boc.code.sharing.yangjunlu;

/**
 * 基类
 */
public class Car {

	public int car_weight;
	public int car_long;
	public int car_bodySize;
	public String car_steeringWheel;
	public String car_colour;
	public String car_tyre;

	public Car(){
		System.out.println("我是父类的Car");
	}

	public void run(){
		System.out.println("我能跑");
	}

	public void turnLeft(){
		System.out.println("向左转");
	}

	public void turnRight(){
		System.out.println("向右转");
	}

}
