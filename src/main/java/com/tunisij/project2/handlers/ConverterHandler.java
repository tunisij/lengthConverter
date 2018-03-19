package com.tunisij.project2.handlers;

public abstract class ConverterHandler {
	
	protected ConverterHandler handler;
	public String units;
	
	public abstract String convert(String kilometers);
	
	public void setSuccessor(ConverterHandler handler) {
		this.handler = handler;
	}

}
