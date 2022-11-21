package com.example.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
 
import com.example.assembler.OrderAssembler;
import com.example.model.UserEmployee;
import com.example.service.UserEmployeeService;
 
@RestController
public class UserMgmtController {
 
    @Autowired
    UserEmployeeService userEmployeeService;
    @Autowired
    OrderAssembler assembler;
 
    /*
     * String format1 = "Hello , %s";
     * 
     * @RequestMapping("/start") public String home(@RequestParam(name = "key",
     * defaultValue = "World") String firstParam) {
     * 
     * return String.format(format1, firstParam); }
     */
 
    /*
     * @GetMapping("/users/{id}") public User getUserList(@PathVariable int id) {
     * 
     * return new User(id,"Thanvi"); }
     */
 
    /*
     * @GetMapping("/users/{id}") public UserEmployee getUserList(@PathVariable int
     * id) {
     * 
     * return new UserEmployee(id,"Thanvi","s","Thanvi.s@gmail.com"); }
     */
 
    /*
     * @GetMapping("/users/{id}") public ResponseEntity<UserEmployee>
     * getUser(@PathVariable int id) {
     * 
     * //return new ResponseEntity<UserEmployee>(new
     * UserEmployee(id,"Thanvi","s","Thanvi.s@gmail.com"), return new
     * ResponseEntity<UserEmployee> (userEmployeeService.getUserEmployeeById(id),
     * HttpStatus.OK);
     * 
     * 
     * }
     */
 
    @GetMapping("/users/{id}")
    public EntityModel<UserEmployee> getUser(@PathVariable int id) {
 
        // return new ResponseEntity<UserEmployee>(new
        // UserEmployee(id,"Thanvi","s","Thanvi.s@gmail.com"),
        // return new ResponseEntity<UserEmployee>
        // (userEmployeeService.getUserEmployeeById(id), HttpStatus.OK);
        UserEmployee user = userEmployeeService.getUserEmployeeById(id);
        EntityModel<UserEmployee> resource = EntityModel.of(user);
        Link link1 = WebMvcLinkBuilder.linkTo(UserMgmtController.class).//
                slash("/users").withRel("AllUsers");
        resource.add(link1);
        return resource;
    }
 
    @GetMapping("/users")
    public List<UserEmployee> getUserList() {
        List<UserEmployee> userEmpList = new ArrayList<>();
        /*
         * userEmpList.add(new UserEmployee(1,"Thanvi","s","Thanvi.s@gmail.com"));
         * userEmpList.add(new UserEmployee(2,"Manisha","s","Manisha.s@gmail.com"));
         */
        userEmpList = userEmployeeService.getAllUserEmployee();
 
        return userEmpList;
    }
 
    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable int id) {
        userEmployeeService.delete(id);
 
        return "User Deleted: " + id;
    }
 
    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@RequestBody UserEmployee userEmployee) {
        userEmployeeService.saveOrUpdate(userEmployee);


        /*
         * URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
         * .buildAndExpand(userEmployee.getUserId()).toUri(); return
         * ResponseEntity.created(location).build();
         */


        return ResponseEntity.ok(assembler.toModel(userEmployee));
    //    return "User creation done: " + userEmployee.getUserId();
    }
 
    @PutMapping("/users/{id}")
    public String updateUser(@RequestBody UserEmployee userEmployee, @PathVariable int id) {
        userEmployeeService.update(userEmployee, id);
        return "User update done: " + userEmployee.getUserId();
    }
 
}