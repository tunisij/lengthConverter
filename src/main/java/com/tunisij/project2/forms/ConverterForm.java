package com.tunisij.project2.forms;

public class ConverterForm {

	private int kilometers;
	private String convertedValue;
	private String units;
	private final String[] dropdown = { "Miles", "Yards", "Feet" };

	public String[] getDropdown() {
		return dropdown;
	}

	public int getKilometers() {
		return kilometers;
	}

	public void setKilometers(int kilometers) {
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
