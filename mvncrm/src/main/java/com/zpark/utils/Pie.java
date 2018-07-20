package com.zpark.utils;

import java.util.List;

public class Pie {
	private String type;
	private String name;
	private List<Part> data;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Part> getData() {
		return data;
	}
	public void setData(List<Part> data) {
		this.data = data;
	}
	public Pie(String type, String name, List<Part> data) {
		super();
		this.type = type;
		this.name = name;
		this.data = data;
	}
	public Pie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}	
