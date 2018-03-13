package com.tunisij.project2.handlers;

public abstract class ConverterHandler {
	
	protected ConverterHandler handler;
	protected String units;
	
	public abstract String convert(double kilometers);
	
	public void setSuccessor(ConverterHandler handler) {
		this.handler = handler;
	}

}
