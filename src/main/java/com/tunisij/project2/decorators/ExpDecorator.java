package com.tunisij.project2.decorators;

import java.text.DecimalFormat;

import com.tunisij.project2.handlers.ConverterHandler;

public class ExpDecorator extends HandlerDecorator {

	private ConverterHandler ch;
	
	public ExpDecorator(ConverterHandler ch) {
		this.ch = ch;
	}
	
	@Override
	public String convert(String kilometers) {
		String[] vals = ch.convert(kilometers).split(" ");
		return new DecimalFormat("0.####E0").format(Double.parseDouble(vals[0])) + " " + (vals.length == 1 ? "" : vals[1]);
	}
	
}
