package com.mit.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
	@Autowired
    private UserRepository userRepository;

    public List<Users> findAll() {
        return userRepository.findAll();
    }

    public Users save(Users user) {
        return userRepository.save(user);
    }

    public Users findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
