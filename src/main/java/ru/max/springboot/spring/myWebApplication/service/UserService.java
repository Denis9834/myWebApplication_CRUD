package ru.max.springboot.spring.myWebApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.max.springboot.spring.myWebApplication.model.User;
import ru.max.springboot.spring.myWebApplication.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public void update(long id, User updateUser) {
        User userToBeUpdated = getUserById(id);

        userToBeUpdated.setName(updateUser.getName());
        userToBeUpdated.setEmail(updateUser.getEmail());
        userToBeUpdated.setAge(updateUser.getAge());
        saveUser(userToBeUpdated);
    }
}
