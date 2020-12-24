package com.xworkz.VTU.engineer;

import com.xworkz.VTU.constants.Branch;

public class ECEngineer extends Engineer {
	
	public Branch branch = Branch.EC;
	
	@Override
	public void problemSolving() {
		System.out.println("ECE: "+"Engieering is solution for Real-Time problems");

	}
	
	public void areaOfProblemSolving() {
		System.out.println("area of problem solving : Electronics");
	}

}
