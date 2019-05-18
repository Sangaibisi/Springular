package com.emrullah.Springular.Controller;

import com.emrullah.Springular.Entitiy.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {

    private List<User> users=createList();

    @RequestMapping(value = "/employees", method = RequestMethod.GET, produces = "application/json")
    public List<User> firstPage() {
        return users;
    }

    private static List<User> createList() {
        List<User> tempEmployees = new ArrayList<>();
        User user1 = new User();
        user1.setCC(false);
        user1.setEmail("emrullahyildirim@windowslive.com");
        user1.setPassword(123);
        user1.setId(1);

        tempEmployees.add(user1);
        return  tempEmployees;
    }
}
