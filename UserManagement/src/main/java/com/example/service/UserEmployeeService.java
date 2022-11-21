package com.example.service;
 
import java.util.ArrayList;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.example.model.UserEmployee;
import com.example.repository.UserEmployeeRepository;
 
@Service
public class UserEmployeeService {

    @Autowired
    UserEmployeeRepository userRepository;

    public List<UserEmployee> getAllUserEmployee() {
        List<UserEmployee> userEmpList = new ArrayList<UserEmployee>();
        userRepository.findAll().forEach(useremp -> userEmpList.add(useremp));
        return userEmpList;
    }

    public UserEmployee getUserEmployeeById(int id) {
 
        return userRepository.findById(id).get();
    }

    public void saveOrUpdate(UserEmployee userEmployee) {
        userRepository.save(userEmployee);

    }

    public void delete(int id) {
        userRepository.deleteById(id);
    }

    public void update(UserEmployee userEmployee, int id) {

        userRepository.save(userEmployee);
 
    }
    
    

}