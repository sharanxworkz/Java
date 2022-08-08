package com.xworkz.java_core.collections.sets.setsCustomsExample.train.service;

import com.xworkz.java_core.collections.sets.setsCustomsExample.train.dao.TrainDAO;
import com.xworkz.java_core.collections.sets.setsCustomsExample.train.dto.TrainDTO;


public interface TrainServices {
	
	public void addTrain(TrainDTO traindto);
	public TrainDTO getTrainDetails(Integer trainNumber);
	public void updateTrainDetails(TrainDTO traindto);
	public void deleteTrainDetails(TrainDTO traindto);
	
}
	