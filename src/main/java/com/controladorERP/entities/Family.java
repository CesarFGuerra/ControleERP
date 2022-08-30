package com.controladorERP.entities;

public class Family {

	private String familyName;
	private Production familyProduction;
	
	public Family() {
	}

	public Family(String familyName, Production familyProduction) {
		super();
		this.familyName = familyName;
		this.familyProduction = familyProduction;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public Production getFamilyProduction() {
		return familyProduction;
	}

	public void setFamilyProduction(Production familyProduction) {
		this.familyProduction = familyProduction;
	}
	
	
	
	
	
}
