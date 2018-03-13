package com.tunisij.project2.handlers;

public class FootHandler extends ConverterHandler {

	public FootHandler(String units) {
		this.units = units;
	}
	
	@Override
	public String convert(double kilometers) {
		return Double.toString(kilometers * 3280.839895);
	}

}
