package com.floor.driver;

import com.floor.service.FloorAssembler;

public class MainClass {

	public static void main(String[] args) {

		FloorAssembler obj = new FloorAssembler();
		obj.inputFloorsPerDay();
		obj.assembleFloors();

	}
}