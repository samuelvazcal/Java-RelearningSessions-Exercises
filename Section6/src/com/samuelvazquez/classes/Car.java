package com.samuelvazquez.classes;

public class Car {
	private int doors;
	private int wheels;
	private String model;
	private String color;

	public void setModel(String model) {
		String validModel = model.toLowerCase();
		if(validModel.equals("carrera") || validModel.equals("commodore")) {
			this.model = model;
		} else {
			this.model = "Unknown";
		}
	}

	public String getModel() {
		return model;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getDoors() {
		return doors;
	}

}
