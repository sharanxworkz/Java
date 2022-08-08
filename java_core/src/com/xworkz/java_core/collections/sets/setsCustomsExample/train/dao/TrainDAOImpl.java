package com.xworkz.java_core.collections.sets.setsCustomsExample.train.dao;

import java.util.HashSet;

import com.xworkz.java_core.collections.sets.setsCustomsExample.train.dto.TrainDTO;

public class TrainDAOImpl implements TrainDAO{
	
	HashSet<TrainDTO> hs = new HashSet<TrainDTO>();
	//ArrayList al = new ArrayList();
	TrainDTO[] train = hs.toArray(new TrainDTO[hs.size()]);

	@Override
	public void addTrain(TrainDTO traindto) {
		hs.add(traindto);
		System.out.println("Train Added Train Details are: " +traindto);
	}

	@Override
	public TrainDTO getTrainDetails(Integer trainNumber) {
			for(int i=0;i<train.length; i++) {
				if(train[i].getNumber()== trainNumber) {
				return train[i];
			}
		}
		System.out.println("hello");	
		return null;
		
	}

	@Override
	public void updateTrainDetails(TrainDTO traindto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTrain(TrainDTO traindto) {
		// TODO Auto-generated method stub
		
	}

}
