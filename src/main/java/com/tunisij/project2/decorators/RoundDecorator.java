package com.tunisij.project2.decorators;

import com.tunisij.project2.handlers.ConverterHandler;

public class RoundDecorator extends HandlerDecorator {

	private ConverterHandler ch;
	
	public RoundDecorator(ConverterHandler ch) {
		this.ch = ch;
	}
	
	@Override
	public String convert(String kilometers) {
		String[] vals = ch.convert(kilometers).split("E");
		return Double.toString(Math.round(Double.parseDouble(vals[0]) * 100.0) / 100.0) + "E" + vals[1];
	}

}
