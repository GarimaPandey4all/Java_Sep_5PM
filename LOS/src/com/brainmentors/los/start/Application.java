package com.brainmentors.los.start;

import com.brainmentors.los.operation.LOSProcess;
import com.brainmentors.los.utils.Utility;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LOSProcess process = new LOSProcess();
		
		System.out.println("Do you have Application Number or Not (Enter 0)");
		int applicationNumber = Utility.scanner.nextInt();
		
		if(applicationNumber == 0)
		{
			//New Customer
			process.sourcing();
		}
		else {
			//Existing Customer
			process.checkStage(applicationNumber);
		}

	}

}
