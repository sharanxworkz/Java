package com.xworkz.jdbcassignment;

public enum DbProperties {
	URL("jdbc:mysql://localhost:3306/perfume"), USERNAME("root"), PASSWORD("sharan@1997");

	private String value;

	private DbProperties(String value) {
		this.value = value;

	}

	public String getValue() {
		return value;
	}

}
