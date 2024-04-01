package com.sabedor.ic.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
public class loginDTO {
	
	@NotBlank(message = "* User Name Required")
	@Size(min = 5, max = 15,message = "User Name Must Be Between 5 to 15 chars")
	private String un;
	
	@NotBlank(message = "* Password Required")
	@Size(min=5,max =15,message = "Password Must Be Between 6 to 15 chars" )
	private String ps;
	
	@AssertTrue(message = "Check and Agree To Terms And Conditions")
	private boolean TermsandConditions;
	
	
	public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un = un;
	}
	public String getPs() {
		return ps;
	}
	public void setPs(String ps) {
		this.ps = ps;
	}
	
	public boolean isTermsandConditions() {
		return TermsandConditions;
	}
	public void setTermsandConditions(boolean termsandConditions) {
		TermsandConditions = termsandConditions;
	}
	
	
}