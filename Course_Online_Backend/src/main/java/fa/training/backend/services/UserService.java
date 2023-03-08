package fa.training.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fa.training.backend.entities.User;
import fa.training.backend.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	public List<User> findAllUser(){
		return userRepository.findAll();
	}
}
