package com.vladancupric;

import org.springframework.stereotype.Component;

@Component
public class Fakultet {
	
	private String naziv;
	private String adresa;
	
	
	public Fakultet() {
		super();
	}


	public Fakultet(String naziv, String adresa) {
		super();
		this.naziv = "FON";
		this.adresa = "Dositejeva 8";
	}


	@Override
	public String toString() {
		return "Fakultet [naziv=" + naziv + ", adresa=" + adresa + "]";
	}
	
	

}
