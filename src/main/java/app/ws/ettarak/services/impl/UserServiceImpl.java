package app.ws.ettarak.services.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.ws.ettarak.entities.UserEntity;
import app.ws.ettarak.repositories.UserRepository;
import app.ws.ettarak.services.UserService;
import app.ws.ettarak.shared.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDto createUser(UserDto userDto) {

		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(userDto, userEntity);
		
		userEntity.setEncryptedPassword("Password Encrypted");
		userEntity.setUserId("user Id");

		UserEntity newUser = userRepository.save(userEntity);
		UserDto userDto1 = new UserDto();

		BeanUtils.copyProperties(newUser, userDto1);

		return userDto1;
	}

}
