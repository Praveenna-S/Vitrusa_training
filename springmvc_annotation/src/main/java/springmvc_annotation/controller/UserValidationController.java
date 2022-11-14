package springmvc_annotation.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import springmvc_annotation.model.Employee;
 

 
@Controller
public class UserValidationController {

    @Autowired
    @Qualifier("userValidationService")
    private Validator validator;

       @InitBinder
       private void initBinder(WebDataBinder binder) {
          binder.setValidator(validator);
       }





		/*
		 * @RequestMapping("/editsummaryValidation") public String
		 * showEditsummary(@ModelAttribute("command") @Validated Employee emp,
		 * BindingResult br ){
		 * System.out.println("in req, mapping controller showEditsummary"+emp.
		 * getSelectExperienceLevel()); // Call Database update
		 * System.out.println("in req, mapping controller showEditsummary"+emp.
		 * getLastname());
		 * System.out.println("in req, mapping controller showEditsummary"+emp.
		 * getSelectExperienceLevel()); if(br.hasErrors()) {
		 * System.out.println("Errors are there"); return "empeditform"; }else {
		 * System.out.println("No errors"); return "editsummary";
		 * 
		 * }
		 * 
		 * }
		 */
     
     @RequestMapping("/editsummary")
     public ModelAndView showEditsummary(@ModelAttribute("command") @Valid Employee emp, BindingResult br) {
         System.out.println("in req, mapping controller showEditsummary" + emp.getSelectExperienceLevel());
         // Call Database update
         System.out.println("in req, mapping controller showEditsummary" + emp.getLastname());
         System.out.println("in req, mapping controller showEditsummary" + emp.getSelectExperienceLevel());
  
         if (br.hasErrors()) {
             System.out.println("Errors are there");
             // return "empeditform";
             return new ModelAndView("empeditform", "command", emp);
         } else {
             System.out.println("No errors");
             // return "editsummary";
             return new ModelAndView("editsummary", "employee", emp);
  
         }
  
     }

 
}