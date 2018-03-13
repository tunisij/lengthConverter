package com.tunisij.project2.handlers;

public class YardHandler extends ConverterHandler {

	public YardHandler(String units) {
		this.units = units;
	}
	
	@Override
	public String convert(double kilometers) {
		return "Yards".equals(units) ? Double.toString(kilometers * 1093.61) : handler.convert(kilometers);
	}

}
