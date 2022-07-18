package pl.nowak.springmvc.service;

import org.springframework.context.annotation.Configuration;
import pl.nowak.springmvc.entity.User;
import pl.nowak.springmvc.repository.UserRepository;

import java.util.List;

@Configuration
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
       return userRepository.findAll();
    }
}
