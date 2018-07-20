package com.zpark.utils;

public class Part {
	private String name;
	private float y;
	private boolean sliced;
	private boolean selected;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public boolean isSliced() {
		return sliced;
	}
	public void setSliced(boolean sliced) {
		this.sliced = sliced;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	public Part(String name, float y, boolean sliced, boolean selected) {
		super();
		this.name = name;
		this.y = y;
		this.sliced = sliced;
		this.selected = selected;
	}
	public Part() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
