package com.xworkz.computers;

import com.xworkz.computers.computerBrands.DellComputer;
import com.xworkz.computers.computerTypes.Desktop;
import com.xworkz.computers.computerTypes.Laptop;
import com.xworkz.computers.constants.DisplayType;
import com.xworkz.computers.constants.OperatingSystemType;

public class ComputerTester {

	public static void main(String[] args) {
		Desktop desktop= new DellComputer();
		DellComputer dell =(DellComputer)desktop;
		dell.setModelName("Dell Inspiron");
		System.out.println("Model Name: "+dell.getModelName());
		System.out.println("operating System: "+dell.getOs(OperatingSystemType.WINDOWS));
		System.out.println("Display type: "+dell.getDisplay(DisplayType.LCD));
		
		Desktop desk = new Laptop();
		Laptop lappy =(Laptop)desk;
		lappy.connectivity();
	}

}
