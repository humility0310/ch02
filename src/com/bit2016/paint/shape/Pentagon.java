package com.bit2016.paint.shape;

import com.bit2016.paint.i.Drawable;

public class Pentagon extends Shape implements Drawable {

	@Override
	public void drow() {//추상메서드를 상속받으면 오버라이드 반드시 입력
		System.out.println("오각형을 그렸습니다.");
	}

	@Override
	public double calcultateArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
