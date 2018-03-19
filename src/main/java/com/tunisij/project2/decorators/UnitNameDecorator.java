package com.tunisij.project2.decorators;

import com.tunisij.project2.handlers.ConverterHandler;

public class UnitNameDecorator extends HandlerDecorator {

	private ConverterHandler ch;
	
	public UnitNameDecorator(ConverterHandler ch) {
		this.ch = ch;
	}
	
	@Override
	public String convert(String kilometers) {
		return ch.convert(kilometers) + (ch.units == null ? " " : " " + ch.units);
	}

}
