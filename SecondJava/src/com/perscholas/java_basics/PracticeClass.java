package com.perscholas.java_basics;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import coffeeshop.Product;

public class PracticeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// first question
		int x, a = 10, b = 4;
		x = a + b;

		System.out.println(x);
		// second question
		double v, s = 2.3, m = 2.4;
		v = s + m;
		System.out.println(v);
// Third question
		int j = 23;
		double d = 2.3;
		double r = j + d;
		System.out.println(r);
		// Write a program that declares two integer variables, assigns an integer to
		// each, and divides the larger number by the smaller number. Assign the result
		// to a variable. Print out the result. Now change the larger number to a
		// decimal. What happens? What corrections are needed?

		int w = 24;
		int e = 2;
		int results = w / e;
		System.out.println("results of w/e :" + results);
		double y = 24.5;
		double f = 3.0;
		double result = y / f;

		System.out.println("results of y/f;" + result);
		// question 6

		double n = 24.5;
		double fu = 3.0;
		double ay = (int) n / fu;

		System.out.println("results of n/fu;" + ay);

		

	}



}
