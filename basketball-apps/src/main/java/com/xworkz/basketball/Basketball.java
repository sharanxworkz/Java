package com.xworkz.basketball;

public class Basketball {
	String basketballName;
	boolean isAirFilled;

	public Basketball() {
		System.out.println(this.getClass().getSimpleName() + " Bean has been created");
	}

	@Override
	public String toString() {
		return "Basketball [basketballName=" + basketballName + ", isAirFilled=" + isAirFilled + "]";
	}

	public Basketball(String basketballName) {
		
		this.basketballName = basketballName;
	}

public Basketball(String basketballName, boolean isAirFilled ) {
		
		this.basketballName = basketballName;
		this.isAirFilled = isAirFilled;
	}
}


