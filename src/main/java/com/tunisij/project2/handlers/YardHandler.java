package com.tunisij.project2.handlers;

public class YardHandler extends ConverterHandler {

	public YardHandler(String units) {
		this.units = units;
	}
	
	@Override
	public String convert(String kilometers) {
		return "Yards".equals(units) ? Double.toString(Integer.parseInt(kilometers) * 1093.61) : handler.convert(kilometers);
	}

}
