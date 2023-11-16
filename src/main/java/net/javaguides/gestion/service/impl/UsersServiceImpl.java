package net.javaguides.gestion.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.gestion.entity.Users;
import net.javaguides.gestion.repository.UsersRepository;
import net.javaguides.gestion.service.UserService;



@Service
public class UsersServiceImpl implements UserService {

	private final UsersRepository userRepository;

    public UsersServiceImpl(UsersRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    @Override
    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }
}