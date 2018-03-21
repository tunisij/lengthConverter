package com.tunisij.project2.handlers;

public class MileHandler extends ConverterHandler {

	public MileHandler(String units) {
		this.units = units;
	}
	
	@Override
	public String convert(String kilometers) {
		return "Miles".equals(units) ? Double.toString(Double.parseDouble(kilometers) * 0.621371) : handler.convert(kilometers);
	}

}
