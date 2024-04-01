package com.sabedor.ic.api;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.CreditCardNumber;

@SuppressWarnings("unused")
public class RegisterDTO {

	
	@NotBlank(message = "* User Name Required")
	@Size(min = 8,message = "User Name can't be less than 8 chars")
	@Size(max = 20,message = "User Name can't be more than 20 chars")
	private String un;
	
	@NotBlank(message = "* Password Required")
	@Size(min=6,max =15,message = "Password Must Be Between 6 to 15 chars")
//	@Pattern(regexp="^(?=. *[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).+$",message="password must "
//		    + "contain at least one digit, one lower case, one upper case, and one special char, "
//			+ "and doesn't contain spaces")
	private String ps;
	
	@NotBlank(message = "* Employee Name Required")
	private String empname;
	
	@NotBlank(message = "* email Required")
	@Email(message = "Enter Valid Email")
	private String email;
	
	@NotBlank(message = "* Mobile Required")
	@Digits(message = "Mobile Number Should Be 10 Digits" , fraction = 0, integer = 10)
	private String mobile;
	
	@NotBlank(message = "* City Required")
	private String city;
	
	@Range(min=20 ,max = 50, message= "* Employee Age Must grater than 20 and Less than 51")
	private int age;
	
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
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
		
}
