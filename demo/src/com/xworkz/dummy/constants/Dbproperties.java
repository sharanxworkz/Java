package com.xworkz.dummy.constants;

public enum Dbproperties {
	
	URL("jdbc:mysql://localhost:3306/pen"),
	USERNAME("root"),SECRET("sharan@1997");
	
	private String value;
	
      private Dbproperties(String value) {
    	  this.value=value;
    	  
	}

	public String getValue() {
		return value;
	}

	
}
