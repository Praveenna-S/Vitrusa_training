package springmvc_annotation.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
 
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
 
import javax.validation.Constraint;
import javax.validation.Payload;
 
@Constraint(validatedBy = EmailIdValidator.class)
@Retention(RUNTIME)
@Target({ TYPE, FIELD, METHOD })
public @interface EmailIdCheck {

    public String message() default "Email Id should contain @";
public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};
 
}