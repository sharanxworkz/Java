package com.xworkz.jdbcpractise.constants;

public enum PillowType {
	
	SOFT("soft"),HARD("hard") ,MEDIUM("medium");
	
	private String val;
	
	private PillowType(String val) {
		this.val=val;
	}
	
	public String getValue() {
		return val;
	}
	

}
