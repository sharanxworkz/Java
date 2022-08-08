package com.xworkz.java_core.collections.sets.setsCustomsExample.train;

import com.xworkz.java_core.collections.sets.setsCustomsExample.train.dto.TrainDTO;
import com.xworkz.java_core.collections.sets.setsCustomsExample.train.service.TrainServices;
import com.xworkz.java_core.collections.sets.setsCustomsExample.train.service.TrainServicesImpl;

public class SetTrainDemo {
	public static void main(String[] args) {
		
		TrainDTO shatabdi = new TrainDTO();
		
		shatabdi.setNumber(12568);
		shatabdi.setTrainName("Shatabdi-Express");
		shatabdi.setNoOfComponents(24);
		shatabdi.setSource("Banglore");
		shatabdi.setDestination("Shivamogga");
		shatabdi.setPrice(450);
		
		TrainDTO ksr = new TrainDTO();
		ksr.setNumber(92345);
		ksr.setTrainName("KSR-Banglore");
		ksr.setNoOfComponents(30);
		ksr.setSource("Chennai");
		ksr.setDestination("Hydrabad");
		ksr.setPrice(250);
		
		TrainDTO raja = new TrainDTO();
		raja.setNumber(54321);
		raja.setTrainName("Raja-Rani");
		raja.setNoOfComponents(25);
		raja.setSource("Bhatkal");
		raja.setDestination("Delhi");
		raja.setPrice(550);
		
		TrainDTO gama = new TrainDTO();
		gama.setNumber(45231);
		gama.setTrainName("Vascodigama");
		gama.setNoOfComponents(20);
		gama.setSource("Bombay");
		gama.setDestination("Banglore");
		gama.setPrice(1000);
		
		TrainServices service = new TrainServicesImpl();
		
			//service.addTrain(shatabdi);
			//service.addTrain(ksr);
			//service.addTrain(raja);
			//service.addTrain(gama);
		
		TrainDTO train = service.getTrainDetails(45231);
		System.out.println(train);
			
			
	}

}
