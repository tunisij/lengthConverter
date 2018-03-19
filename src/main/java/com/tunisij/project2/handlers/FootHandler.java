package com.tunisij.project2.handlers;

public class FootHandler extends ConverterHandler {

	public FootHandler(String units) {
		this.units = units;
	}
	
	@Override
	public String convert(String kilometers) {
		return Double.toString(Integer.parseInt(kilometers) * 3280.839895);
	}

}
