package springmvc_annotation.validation;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import springmvc_annotation.model.Employee;

 
@Service("userValidationService")
public class UserValidation implements Validator{
 
    @Override
    public boolean supports(Class<?> clazz) {
        // TODO Auto-generated method stub
        return Employee.class.isAssignableFrom(clazz);
    }
 
    @Override
    public void validate(Object target, Errors errors) {

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", 
                "lastname.required","Lastname Can't be empty");

        /*
         * Employee emp = (Employee) target; //connect to DB and do VAlidations
         * errors.rejectValue("emailId", "emailId.notavailable",
         * "emailId can't be taken");
         */


    }
 
}