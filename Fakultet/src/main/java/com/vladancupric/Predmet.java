package com.vladancupric;

import org.springframework.stereotype.Component;

@Component
public class Predmet {
	private String naziv;
	private String sifra;
	private int espb;
	
	
	public Predmet() {
		super();
	}


	public Predmet(String naziv, String sifra, int espb) {
		super();
		this.naziv = "Programiranje Internet Aplikacija";
		this.sifra = "KT104";
		this.espb = 6;
	}


	@Override
	public String toString() {
		return "Predmet [naziv=" + naziv + ", sifra=" + sifra + ", espb=" + espb + "]";
	}
	

}
