package com.xworkz.java_core.collections.sets.setsCustomsExample.train.dto;

public class TrainDTO {
	
	private String trainName;
	private Integer trainNumber;
	private Integer noOfComponents;
	private String source;
	private String Destination;
	private double price;
	
	public TrainDTO(){
		
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public Integer getNumber() {
		return trainNumber;
	}

	public void setNumber(Integer trainNumber) {
		this.trainNumber = trainNumber;
	}

	public Integer getNoOfComponents() {
		return noOfComponents;
	}

	public void setNoOfComponents(Integer noOfComponents) {
		this.noOfComponents = noOfComponents;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "TrainDTO [trainName=" + trainName + ", trainNumber=" + trainNumber + ", noOfComponents="
				+ noOfComponents + ", source=" + source + ", Destination=" + Destination + ", price=" + price + "]";
	}

	
	
	
	
}
