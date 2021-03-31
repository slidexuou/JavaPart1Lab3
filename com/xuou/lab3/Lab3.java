package com.xuou.lab3;

public class Lab3 {
	public static void main(String[] args) {
		int i = 20;

		i++;
		i++;
		i++;
		i++;
		i++;
		System.out.println(i);
		value();

	}

	public static void value() {
		int i = 20;
		float a = 0.1f;
		float b = 0.3f;
		char c = '\u5522';
		char d = '\u2522';
		i--;
		i--;
		i--;
		i--;
		i--;
		System.out.println(i);
		if ((a == 0.1f) && (b == 0.3f)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		if((c==a)||(d==a)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
