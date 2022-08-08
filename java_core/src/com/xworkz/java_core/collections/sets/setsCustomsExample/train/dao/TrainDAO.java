package com.xworkz.java_core.collections.sets.setsCustomsExample.train.dao;

import com.xworkz.java_core.collections.sets.setsCustomsExample.train.dto.TrainDTO;

public interface TrainDAO {
	
	public void addTrain(TrainDTO traindto);
	public TrainDTO getTrainDetails(Integer trainNumber);
	public void updateTrainDetails(TrainDTO traindto);
	public void deleteTrain(TrainDTO traindto);
}
