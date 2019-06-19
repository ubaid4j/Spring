package com.ubaid.springMVC.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.ubaid.springMVC.mvc.annotations.CourseCode;

/**
 * 
 * @author UbaidurRehman
 * 
 * Here we used 
 * 1. @NotNull which constrained the required field from being not nulled
 * 2. @Size which constrained on the size of string
 * 3. @Min which constrained on the numbers the min value
 * 4. @Max which constrained on the number the max value
 * 5. @Pattern which accept the regexp and allow when regex is correct
 * The above first annotations (constrained) are built in (javax) 
 * 6. @CourseCode is custom annotation which constraint the courseCode being right 
 *
 *
 */


@Component
@Scope("prototype")
public class Customer
{
	private String firstName;
	
	@NotNull(message=" is required")
	@Size(min=1, message=" is required")
	private String lastName;
	@NotNull(message=" is required")
	@Min(value=1, message="the required input should be greater or equal than 1")
	@Max(value=10, message="the required input should be smaller or equal than 10")
	private Integer freePasses;
	@Pattern(regexp="[a-zA-Z0-9]{5}", message="postal address is not valid")
	private String postalAddress;
	@CourseCode(value="Ubaid", message="the code should start from Ubaid")
	private String courseCode;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getPostalAddress() {
		return postalAddress;
	}
	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
}
