package com.example.assembler;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import com.example.controller.UserMgmtController;
import com.example.model.UserEmployee;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@Component("assembler")
public class OrderAssembler implements RepresentationModelAssembler<UserEmployee, EntityModel<UserEmployee>> {
 
    @Override
    public EntityModel<UserEmployee> toModel(UserEmployee user) {

         EntityModel<UserEmployee> orderModel = EntityModel.of(user,
                   linkTo(methodOn(UserMgmtController.class).getUser(user.getUserId())).withSelfRel(),
                    linkTo(methodOn(UserMgmtController.class).getUserList()).withRel("Users"));


        return orderModel;
    }



 
}