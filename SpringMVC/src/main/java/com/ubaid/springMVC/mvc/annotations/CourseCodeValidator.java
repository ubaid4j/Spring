package com.ubaid.springMVC.mvc.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 
 * 
 *	
 * 1. CourseCodeValidator implements ConstraintValidator 
 * 2. ConstraintValidator is interface in JAVAX which provide isValid method in which
 *    we can write our business logic
 *  
 * 3. In this class, we are first assigning our prefix with the value [declare at our CourseCode
 *    annotation]. Then in isValid() method, we are checking if our courseCode(the first parameter 
 *    of isValid() method )(and it is actually the courseCode field in HTML form) starting from
 *    the given prefix 
 *    
 * @author UbaidurRehman
 *
 */
public class CourseCodeValidator implements ConstraintValidator<CourseCode, String>
{

	private String prefix;
	
	@Override
	public void initialize(CourseCode constraintAnnotation)
	{
		prefix = constraintAnnotation.value();
	}

	@Override
	public boolean isValid(String courseCode, ConstraintValidatorContext context)
	{
		boolean result;
		if(courseCode != null)
		{
			result = courseCode.startsWith(prefix);
		}
		else
		{
			result = true;
		}
		return result;
	}

}
