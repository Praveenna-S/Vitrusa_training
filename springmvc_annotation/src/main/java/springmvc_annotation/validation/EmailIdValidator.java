package springmvc_annotation.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
 
public class EmailIdValidator implements ConstraintValidator<EmailIdCheck, String>{
 
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
 
        // Validate with business logic or connect to DB
        boolean isEmailValid = value.contains("@");
        return isEmailValid;
    }
 
}