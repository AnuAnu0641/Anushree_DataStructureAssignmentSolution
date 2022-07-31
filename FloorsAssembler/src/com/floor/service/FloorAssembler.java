package com.floor.service;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class FloorAssembler implements IFloorAssembler {

	static Deque<Integer> queue = new ArrayDeque<Integer>();
	static Stack<Integer> stack1 = new Stack<>();
	static Stack<Integer> stack2 = new Stack<>();
	
	private static Scanner sc = new Scanner(System.in);

	int dayNumber;

	@Override
	public void inputFloorsPerDay() {

		System.out.println("Enter the total number of floors in building ");
		int noOfFloors = sc.nextInt();
		dayNumber = 1;
		while (noOfFloors != 0) {
			System.out.println("Enter the floor size given on day : " + dayNumber);
			int tmp = sc.nextInt();
			queue.add(tmp);
			stack1.add(dayNumber);
			dayNumber++;
			noOfFloors--;
		}
	}

	@Override
	public void assembleFloors() {

		System.out.println("\nThe order of construction is as follows : \n");

		for (int i = 1; i < dayNumber; i++) {

			System.out.println("Day " + (i) + " :");
			int queueFirst = queue.poll();

			if (queueFirst < stack1.peek())
				stack2.push(queueFirst);
			else {
				stack2.push(queueFirst);
				stack2.sort(null);

				while (!stack2.isEmpty() && stack2.peek() == stack1.peek()) {
					System.out.print(stack2.pop() + " ");
					stack1.pop();
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
