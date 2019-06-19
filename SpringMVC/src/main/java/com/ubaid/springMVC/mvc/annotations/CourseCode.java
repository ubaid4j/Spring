package com.ubaid.springMVC.mvc.annotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * 
 * 
 * 
 * 1. @Constraint will tell which class [implemented with ConstraintValidator]
 * 	              will validate this annotation
 * 2. @Retention  will tell when will this annotation is retained
 *                e.g. at class level, at runtime etc
 * 3. @Target     will tell in which items this annotation will apply
 *
 * @author UbaidurRehman
 *
 */
@Constraint(validatedBy = CourseCodeValidator.class)
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
public @interface CourseCode
{
	//as we want our annotations like this
	//@CourseCode(value="", message="")
	//so, we need to add value and message methods and their default values
	
	//these methods are mandatory as, we want them in our annotations
	public String value() default "LUV";
	public String message() default "Course Code must start from LUV";
	
	//for more errors we wrote these methods, these are also mandatory
	public Class<?>[] groups() default {};
	public Class<? extends Payload>[] payload() default {};
	
}
