package com_520it;

import java.math.BigDecimal;

//能够显示汉字么
public class Mathdemo {
	public static void main(String[] args) {
		double ran = Math.random();
		System.out.println((int) (ran * 100));
		System.out.println(0.01 + 0.09);
		BigDecimal num1 = new BigDecimal("0.01");
		BigDecimal num2 = new BigDecimal("0.09");

	}
}
