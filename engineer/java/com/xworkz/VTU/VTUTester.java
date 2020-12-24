package com.xworkz.VTU;

import com.xworkz.VTU.engineer.CIVILEngineer;
import com.xworkz.VTU.engineer.CSEngineer;
import com.xworkz.VTU.engineer.ECEngineer;
import com.xworkz.VTU.engineer.Engineer;

public class VTUTester {

	public static void main(String[] args) {
		
		Engineer engineer = new Engineer();
		//System.out.println(engineer.branch);
		//System.out.println(engineer.USN);
		engineer.problemSolving();
		
		ECEngineer ece=new ECEngineer();
		System.out.println(ece.getBranch());
		ece.problemSolving();
		ece.areaOfProblemSolving();
		
		CSEngineer cse = new CSEngineer();
		System.out.println(cse.branch);
		cse.problemSolving();
		cse.areaOfProblemSolving();
		
		Engineer engg = new ECEngineer();
		System.out.println(engg.getBranch());
		engg.problemSolving();
		
		ECEngineer ece2 = new CSEngineer();
		ece2.areaOfProblemSolving();
		
		Engineer engg3 = new CIVILEngineer();
		engg3.problemSolving();
	

	}

}
