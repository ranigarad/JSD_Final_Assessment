package userDetail.userDetail.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import userDetail.userDetail.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
    private UserRepository userRepository;

    @PostMapping("/saveUser")
    public User saveUser(@RequestBody User user) {
        return userRepository.save(user);
    }

}
