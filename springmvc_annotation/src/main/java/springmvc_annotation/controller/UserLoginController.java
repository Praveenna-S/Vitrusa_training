package springmvc_annotation.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import springmvc_annotation.model.Employee;
import springmvc_annotation.service.UserLoginServiceImpl;


/*@SessionAttribute("expLevelList")*/
@Controller
public class UserLoginController {

	@Autowired
	UserLoginServiceImpl userService;
	
	
	@RequestMapping("/empform")
	public String showEmployeeForm(Model model)
	{
		model.addAttribute("command",new Employee()); 
		return "empform";
	}
	
	@RequestMapping("/viewemp")
	public String viewEmployeeForm(Model m)
	{
		List<Employee> emplist=		userService.getEmployees();
		
		m.addAttribute("list",emplist);
		m.addAttribute("command",new Employee()); 

		return "viewemp";
	}
	
	@RequestMapping(value="/save" ,method=RequestMethod.GET)
	public String saveEmployeeForm()
	{
		return "viewemp";
	}
	
	@RequestMapping(value="/editemp/{id}")  
    public String edit(@PathVariable int id, Model model){  
 
        Employee emp = new Employee();
        emp.setName("Edited:Name1");
        emp.setLastname("Edited:Last Name1");
        emp.setEmailId("Edited:Email Id1");
        emp.setId(id);

        model.addAttribute("command",emp);

         List<String> expLevelList = Arrays.asList(
                 "1st set", "2nd Set", "Senior M",
                 "Group M");
         model.addAttribute("expLevelList",expLevelList);
 
        return "empeditform";
    }

	/*
	 * @RequestMapping("/empeditform") public String
	 * showEmpeditform(@ModelAttribute("employee") Employee emp,
	 * 
	 * @ModelAttribute("expLevelList") List<String> employeeSkills ){ return
	 * "editsummary"; }
	 */
	
	
    @RequestMapping("/editsummary")  
    public void showEditsummary(@ModelAttribute("employee") Employee emp ){  
        System.out.println("in req, mapping controller showEditsummary"+emp.getSelectExperienceLevel());
        // Call Database update     
        System.out.println("in req, mapping controller showEditsummary"+emp.getLastname());
 
    } 
    
    @RequestMapping("/hello")
    @ResponseBody
    public String getResponse() {
        return "Hello World";
    }
}
