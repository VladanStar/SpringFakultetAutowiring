package com.vladancupric;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Profesor {
	private Predmet predmet;
	private Fakultet fakultet;
	
	public Profesor() {
		super();
	}
	@Autowired
	public Profesor(Predmet predmet, Fakultet fakultet) {
		super();
		this.predmet = predmet;
		this.fakultet = fakultet;
	}
	@Override
	public String toString() {
		return "Profesor [predmet=" + predmet + ", fakultet=" + fakultet + "]";
	}
	
	

}
