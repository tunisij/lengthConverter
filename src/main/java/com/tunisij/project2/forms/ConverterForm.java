package com.tunisij.project2.forms;

public class ConverterForm {

	private double kilometers;
	private String convertedValue;
	private String units;
	private final String[] dropdown = { "Miles", "Yards", "Feet" };

	public String[] getDropdown() {
		return dropdown;
	}

	public double getKilometers() {
		return kilometers;
	}

	public void setKilometers(double kilometers) {
		this.kilometers = kilometers;
	}

	public String getConvertedValue() {
		return convertedValue;
	}

	public void setConvertedValue(String convertedValue) {
		this.convertedValue = convertedValue;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

}
