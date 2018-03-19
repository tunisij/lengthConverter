package com.tunisij.project2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tunisij.project2.decorators.ExpDecorator;
import com.tunisij.project2.decorators.RoundDecorator;
import com.tunisij.project2.decorators.UnitNameDecorator;
import com.tunisij.project2.forms.ConverterForm;
import com.tunisij.project2.handlers.ConverterHandler;
import com.tunisij.project2.handlers.FootHandler;
import com.tunisij.project2.handlers.MileHandler;
import com.tunisij.project2.handlers.YardHandler;

@Controller
public class ConverterController {
	
	@RequestMapping(value = "/convert")
	public ModelAndView convert(@ModelAttribute("converterForm") ConverterForm form) {
		MileHandler mh = new MileHandler(form.getUnits());
		YardHandler yh = new YardHandler(form.getUnits());
		FootHandler fh = new FootHandler(form.getUnits());
		
		mh.setSuccessor(yh);
		yh.setSuccessor(fh);
		
		ConverterHandler handler = new RoundDecorator(new ExpDecorator(new UnitNameDecorator(mh)));
		
		form.setConvertedValue(handler.convert(Integer.toString(form.getKilometers())));
		return new ModelAndView("lengthConverter", "converterForm", form);
	}
	
}
