package com.linecomparision;

import java.lang.*;
import java.util.Scanner;

public class LineComparision {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		// making object of Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first co-ordinate");
		// taking two inputs from user as point co ordinates
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("enter the second co-ordinate");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		// printing the co ordinates in well defined manner
		System.out.println("the first co-ordinate is (" + x1 + "," + y1 + ") ");
		System.out.println("the second co-ordinate is (" + x2 + "," + y2 + ") ");
		double length;
		// finding the squares
		int point1 = (x2 - x1) * (x2 - x1);
		int point2 = (y2 - y1) * (y2 - y1);
		// finding the square root
		length = Math.sqrt(point1 + point2);
		// printing the length of the line
		System.out.println("length of the line is " + length);

	}
}